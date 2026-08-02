package com.googlecode.mp4parser.authoring.builder;

import android.support.v4.media.session.PlaybackStateCompat;
import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bq90;
import xsna.etx;
import xsna.f0h0;
import xsna.ga8;
import xsna.ipa;
import xsna.kpa;
import xsna.pa8;
import xsna.pc30;
import xsna.q100;
import xsna.skd;
import xsna.uep0;
import xsna.up2;
import xsna.vju;
import xsna.vua0;
import xsna.wyo;
import xsna.xil;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes13.dex */
public final class DefaultMp4Builder {
    public static final q100 f = q100.a(DefaultMp4Builder.class);
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public final HashMap<uep0, List<f0h0>> c = new HashMap<>();
    public final HashMap<uep0, long[]> d = new HashMap<>();
    public vua0 e;

    public class InterleaveChunkMdat implements ga8 {
        List<List<f0h0>> chunkList;
        long contentSize;
        yej parent;
        List<uep0> tracks;

        public class a implements Comparator<uep0> {
            @Override // java.util.Comparator
            public final int compare(uep0 uep0Var, uep0 uep0Var2) {
                return up2.p(uep0Var.i3().i - uep0Var2.i3().i);
            }
        }

        public /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, pc30 pc30Var, Map map, long j, InterleaveChunkMdat interleaveChunkMdat) {
            this(pc30Var, map, j);
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt((int) 1);
            }
            allocate.put(etx.c(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                allocate.putLong(size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
            DefaultMp4Builder.f.b("About to write " + this.contentSize);
            Iterator<List<f0h0>> it = this.chunkList.iterator();
            long j = 0;
            long j2 = 0;
            while (it.hasNext()) {
                for (f0h0 f0h0Var : it.next()) {
                    f0h0Var.a(writableByteChannel);
                    j += f0h0Var.getSize();
                    if (j > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        j -= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        j2++;
                        DefaultMp4Builder.f.b("Written " + j2 + "MB");
                    }
                }
            }
        }

        public long getDataOffset() {
            ga8 next;
            long j = 16;
            Object obj = this;
            while (obj instanceof ga8) {
                ga8 ga8Var = (ga8) obj;
                Iterator<ga8> it = ga8Var.getParent().getBoxes().iterator();
                while (it.hasNext() && obj != (next = it.next())) {
                    j += next.getSize();
                }
                obj = ga8Var.getParent();
            }
            return j;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        @Override // xsna.ga8
        public yej getParent() {
            return this.parent;
        }

        @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // xsna.ga8
        public String getType() {
            return MediaDataBox.TYPE;
        }

        @Override // xsna.ga8
        public void setParent(yej yejVar) {
            this.parent = yejVar;
        }

        private InterleaveChunkMdat(pc30 pc30Var, Map<uep0, int[]> map, long j) {
            int i;
            this.chunkList = new ArrayList();
            this.contentSize = j;
            this.tracks = pc30Var.b;
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new a());
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uep0 uep0Var = (uep0) it.next();
                hashMap.put(uep0Var, 0);
                hashMap2.put(uep0Var, 0);
                hashMap3.put(uep0Var, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
            }
            while (true) {
                Iterator it2 = arrayList.iterator();
                uep0 uep0Var2 = null;
                while (it2.hasNext()) {
                    uep0 uep0Var3 = (uep0) it2.next();
                    if (uep0Var2 == null || ((Double) hashMap3.get(uep0Var3)).doubleValue() < ((Double) hashMap3.get(uep0Var2)).doubleValue()) {
                        if (((Integer) hashMap.get(uep0Var3)).intValue() < map.get(uep0Var3).length) {
                            uep0Var2 = uep0Var3;
                        }
                    }
                }
                if (uep0Var2 == null) {
                    return;
                }
                int intValue = ((Integer) hashMap.get(uep0Var2)).intValue();
                int i2 = map.get(uep0Var2)[intValue];
                int intValue2 = ((Integer) hashMap2.get(uep0Var2)).intValue();
                double doubleValue = ((Double) hashMap3.get(uep0Var2)).doubleValue();
                int i3 = intValue2;
                while (true) {
                    i = intValue2 + i2;
                    if (i3 >= i) {
                        break;
                    }
                    doubleValue += uep0Var2.Q3()[i3] / uep0Var2.i3().c;
                    i3++;
                    intValue = intValue;
                }
                this.chunkList.add(uep0Var2.K().subList(intValue2, i));
                hashMap.put(uep0Var2, Integer.valueOf(intValue + 1));
                hashMap2.put(uep0Var2, Integer.valueOf(i));
                hashMap3.put(uep0Var2, Double.valueOf(doubleValue));
            }
        }

        @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
        public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        }
    }

    public static long b(pc30 pc30Var) {
        long j = ((uep0) pc30Var.b.iterator().next()).i3().c;
        Iterator it = pc30Var.b.iterator();
        while (it.hasNext()) {
            long j2 = ((uep0) it.next()).i3().c;
            long j3 = j;
            long j4 = j2;
            while (j4 > 0) {
                long j5 = j3 % j4;
                j3 = j4;
                j4 = j5;
            }
            j *= j2 / j3;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.googlecode.mp4parser.BasicContainer] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.coremedia.iso.boxes.MediaInformationBox, com.googlecode.mp4parser.BasicContainer] */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.googlecode.mp4parser.BasicContainer, xsna.ga8] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.coremedia.iso.boxes.TrackBox, com.googlecode.mp4parser.BasicContainer] */
    /* JADX WARN: Type inference failed for: r5v40, types: [com.coremedia.iso.boxes.DataInformationBox, com.googlecode.mp4parser.BasicContainer, xsna.ga8] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [int] */
    /* JADX WARN: Type inference failed for: r5v65, types: [int] */
    /* JADX WARN: Type inference failed for: r6v38, types: [com.coremedia.iso.boxes.SampleTableBox, com.googlecode.mp4parser.BasicContainer, xsna.ga8] */
    /* JADX WARN: Type inference failed for: r7v6, types: [xsna.yej] */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox, com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox, xsna.ga8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    public final BasicContainer a(pc30 pc30Var) {
        HashMap<uep0, long[]> hashMap;
        boolean z;
        boolean z2;
        HashSet hashSet;
        HashMap hashMap2;
        ga8 next;
        q100 q100Var;
        MovieBox movieBox;
        boolean z3;
        Iterator it;
        HashSet hashSet2;
        HashMap hashMap3;
        EditBox editBox;
        q100 q100Var2;
        uep0 uep0Var;
        Object obj;
        Object obj2;
        int i;
        long duration;
        int i2;
        int i3;
        int i4;
        long j;
        DefaultMp4Builder defaultMp4Builder = this;
        pc30 pc30Var2 = pc30Var;
        if (defaultMp4Builder.e == null) {
            defaultMp4Builder.e = new vua0();
        }
        q100 q100Var3 = f;
        q100Var3.b("Creating movie " + pc30Var2);
        Iterator it2 = pc30Var2.b.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            hashMap = defaultMp4Builder.d;
            z = false;
            if (!hasNext) {
                break;
            }
            DefaultMp4Builder defaultMp4Builder2 = defaultMp4Builder;
            q100 q100Var4 = q100Var3;
            uep0 uep0Var2 = (uep0) it2.next();
            List<f0h0> K = uep0Var2.K();
            defaultMp4Builder2.c.put(uep0Var2, K);
            int size = K.size();
            long[] jArr = new long[size];
            for (int i5 = 0; i5 < size; i5++) {
                jArr[i5] = K.get(i5).getSize();
            }
            hashMap.put(uep0Var2, jArr);
            pc30Var2 = pc30Var;
            q100Var3 = q100Var4;
            defaultMp4Builder = defaultMp4Builder2;
        }
        BasicContainer basicContainer = new BasicContainer();
        LinkedList linkedList = new LinkedList();
        linkedList.add("mp42");
        linkedList.add("iso6");
        linkedList.add(VisualSampleEntry.TYPE3);
        linkedList.add("isom");
        long j2 = 1;
        basicContainer.addBox(new FileTypeBox("iso6", 1L, linkedList));
        HashMap hashMap4 = new HashMap();
        Iterator it3 = pc30Var2.b.iterator();
        while (true) {
            z2 = true;
            if (!it3.hasNext()) {
                break;
            }
            HashMap<uep0, long[]> hashMap5 = hashMap;
            q100 q100Var5 = q100Var3;
            BasicContainer basicContainer2 = basicContainer;
            uep0 uep0Var3 = (uep0) it3.next();
            this.e.getClass();
            double d = uep0Var3.i3().c;
            long j3 = (long) (2.0d * d);
            long[] jArr2 = new long[0];
            long[] B3 = uep0Var3.B3();
            long[] Q3 = uep0Var3.Q3();
            long j4 = 2;
            if (B3 != null) {
                int length = B3.length;
                long[] jArr3 = new long[length];
                long duration2 = uep0Var3.getDuration();
                int i6 = 0;
                long j5 = 0;
                while (i6 < Q3.length) {
                    long j6 = j4;
                    int binarySearch = Arrays.binarySearch(B3, i6 + 1);
                    if (binarySearch >= 0) {
                        jArr3[binarySearch] = j5;
                    }
                    j5 += Q3[i6];
                    i6++;
                    j4 = j6;
                }
                int i7 = 0;
                long j7 = 0;
                while (true) {
                    i4 = length - 1;
                    if (i7 >= i4) {
                        break;
                    }
                    long j8 = jArr3[i7];
                    int i8 = i7 + 1;
                    long j9 = jArr3[i8];
                    if (j7 > j9 || Math.abs(j8 - j7) >= Math.abs(j9 - j7)) {
                        j = j4;
                    } else {
                        j = j4;
                        jArr2 = skd.b(jArr2, B3[i7]);
                        j7 = jArr3[i7] + j3;
                    }
                    i7 = i8;
                    j4 = j;
                }
                if (duration2 - jArr3[i4] > j3 / j4) {
                    jArr2 = skd.b(jArr2, B3[i4]);
                }
            } else {
                int i9 = 1;
                jArr2 = new long[]{1};
                int i10 = 1;
                double d2 = 0.0d;
                while (i10 < Q3.length) {
                    double d3 = (Q3[i10] / d) + d2;
                    if (d3 >= 2.0d) {
                        if (i10 > 0) {
                            i3 = 1;
                            jArr2 = skd.b(jArr2, i10 + 1);
                        } else {
                            i3 = 1;
                        }
                        i2 = i3;
                        d2 = 0.0d;
                    } else {
                        i2 = 1;
                        d2 = d3;
                    }
                    i10++;
                    i9 = i2;
                }
                if (d2 < 2.0d && jArr2.length > i9) {
                    jArr2[jArr2.length - i9] = (((Q3.length + i9) - jArr2[jArr2.length - 2]) / 2) + jArr2[jArr2.length - 2];
                }
            }
            long[] jArr4 = jArr2;
            int[] iArr = new int[jArr4.length];
            int i11 = 0;
            while (i11 < jArr4.length) {
                int i12 = i11 + 1;
                iArr[i11] = up2.p((jArr4.length == i12 ? uep0Var3.K().size() : jArr4[i12] - 1) - (jArr4[i11] - 1));
                i11 = i12;
            }
            hashMap4.put(uep0Var3, iArr);
            pc30Var2 = pc30Var;
            q100Var3 = q100Var5;
            defaultMp4Builder = this;
            basicContainer = basicContainer2;
            hashMap = hashMap5;
            z = false;
            j2 = 1;
        }
        MovieBox movieBox2 = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(pc30Var2.a);
        long b = b(pc30Var2);
        long j10 = j2;
        long j11 = 0;
        for (uep0 uep0Var4 : pc30Var2.b) {
            MovieBox movieBox3 = movieBox2;
            HashMap<uep0, long[]> hashMap6 = hashMap;
            q100 q100Var6 = q100Var3;
            BasicContainer basicContainer3 = basicContainer;
            if (uep0Var4.L1() == null || uep0Var4.L1().isEmpty()) {
                duration = (uep0Var4.getDuration() * b) / uep0Var4.i3().c;
            } else {
                double d4 = 0.0d;
                while (uep0Var4.L1().iterator().hasNext()) {
                    d4 += (long) ((wyo) r2.next()).b;
                }
                duration = (long) (d4 * b);
            }
            pc30Var2 = pc30Var;
            if (duration > j11) {
                j11 = duration;
                movieBox2 = movieBox3;
                basicContainer = basicContainer3;
                hashMap = hashMap6;
                z2 = true;
                z = false;
                j10 = 1;
                q100Var3 = q100Var6;
            } else {
                q100Var3 = q100Var6;
                movieBox2 = movieBox3;
                basicContainer = basicContainer3;
                hashMap = hashMap6;
                z2 = true;
                z = false;
                j10 = 1;
            }
            defaultMp4Builder = this;
        }
        movieHeaderBox.setDuration(j11);
        movieHeaderBox.setTimescale(b);
        long j12 = 0;
        for (uep0 uep0Var5 : pc30Var2.b) {
            MovieBox movieBox4 = movieBox2;
            HashMap<uep0, long[]> hashMap7 = hashMap;
            q100 q100Var7 = q100Var3;
            BasicContainer basicContainer4 = basicContainer;
            if (j12 < uep0Var5.i3().i) {
                j12 = uep0Var5.i3().i;
            }
            pc30Var2 = pc30Var;
            q100Var3 = q100Var7;
            movieBox2 = movieBox4;
            basicContainer = basicContainer4;
            hashMap = hashMap7;
            z2 = true;
            z = false;
            j10 = 1;
            defaultMp4Builder = this;
        }
        movieHeaderBox.setNextTrackId(j12 + j10);
        movieBox2.addBox(movieHeaderBox);
        Iterator it4 = pc30Var2.b.iterator();
        while (true) {
            boolean hasNext2 = it4.hasNext();
            hashSet = defaultMp4Builder.b;
            hashMap2 = defaultMp4Builder.a;
            if (!hasNext2) {
                break;
            }
            pc30 pc30Var3 = pc30Var2;
            HashMap hashMap8 = hashMap4;
            uep0 uep0Var6 = (uep0) it4.next();
            ?? trackBox = new TrackBox();
            TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
            trackHeaderBox.setEnabled(z2);
            trackHeaderBox.setInMovie(z2);
            trackHeaderBox.setMatrix(uep0Var6.i3().e);
            uep0Var6.i3().getClass();
            trackHeaderBox.setAlternateGroup(z ? 1 : 0);
            trackHeaderBox.setCreationTime(uep0Var6.i3().d);
            if (uep0Var6.L1() == null || uep0Var6.L1().isEmpty()) {
                q100Var = q100Var3;
                trackHeaderBox.setDuration((b(pc30Var3) * uep0Var6.getDuration()) / uep0Var6.i3().c);
            } else {
                Iterator it5 = uep0Var6.L1().iterator();
                long j13 = 0;
                while (it5.hasNext()) {
                    j13 += (long) ((wyo) it5.next()).b;
                    q100Var3 = q100Var3;
                }
                q100Var = q100Var3;
                trackHeaderBox.setDuration(uep0Var6.i3().c * j13);
            }
            trackHeaderBox.setHeight(uep0Var6.i3().g);
            trackHeaderBox.setWidth(uep0Var6.i3().f);
            trackHeaderBox.setLayer(uep0Var6.i3().j);
            trackHeaderBox.setModificationTime(new Date());
            trackHeaderBox.setTrackId(uep0Var6.i3().i);
            trackHeaderBox.setVolume(uep0Var6.i3().h);
            trackBox.addBox(trackHeaderBox);
            if (uep0Var6.L1() == null || uep0Var6.L1().size() <= 0) {
                movieBox = movieBox2;
                z3 = z ? 1 : 0;
                it = it4;
                hashSet2 = hashSet;
                hashMap3 = hashMap2;
                editBox = null;
            } else {
                EditListBox editListBox = new EditListBox();
                editListBox.setVersion(z ? 1 : 0);
                ArrayList arrayList = new ArrayList();
                Iterator it6 = uep0Var6.L1().iterator();
                while (it6.hasNext()) {
                    wyo wyoVar = (wyo) it6.next();
                    boolean z4 = z;
                    MovieBox movieBox5 = movieBox2;
                    double d5 = wyoVar.b;
                    long j14 = ((uep0) pc30Var3.b.iterator().next()).i3().c;
                    Iterator it7 = pc30Var3.b.iterator();
                    long j15 = j14;
                    while (it7.hasNext()) {
                        j15 = pc30.b(((uep0) it7.next()).i3().c, j15);
                        hashSet = hashSet;
                        it4 = it4;
                    }
                    long round = Math.round(j15 * d5);
                    Iterator it8 = it4;
                    long j16 = (uep0Var6.i3().c * wyoVar.c) / wyoVar.a;
                    HashMap hashMap9 = hashMap2;
                    double d6 = wyoVar.d;
                    EditListBox.a aVar = new EditListBox.a();
                    aVar.b = round;
                    aVar.c = j16;
                    aVar.d = d6;
                    aVar.a = editListBox;
                    arrayList.add(aVar);
                    it6 = it6;
                    z = z4 ? 1 : 0;
                    movieBox2 = movieBox5;
                    hashSet = hashSet;
                    it4 = it8;
                    hashMap2 = hashMap9;
                    pc30Var3 = pc30Var;
                }
                editListBox.setEntries(arrayList);
                EditBox editBox2 = new EditBox();
                editBox2.addBox(editListBox);
                movieBox = movieBox2;
                z3 = z;
                it = it4;
                hashSet2 = hashSet;
                hashMap3 = hashMap2;
                editBox = editBox2;
            }
            trackBox.addBox(editBox);
            MediaBox mediaBox = new MediaBox();
            trackBox.addBox(mediaBox);
            MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
            mediaHeaderBox.setCreationTime(uep0Var6.i3().d);
            mediaHeaderBox.setDuration(uep0Var6.getDuration());
            mediaHeaderBox.setTimescale(uep0Var6.i3().c);
            mediaHeaderBox.setLanguage(uep0Var6.i3().b);
            mediaBox.addBox(mediaHeaderBox);
            HandlerBox handlerBox = new HandlerBox();
            mediaBox.addBox(handlerBox);
            handlerBox.setHandlerType(uep0Var6.getHandler());
            ?? mediaInformationBox = new MediaInformationBox();
            if (uep0Var6.getHandler().equals("vide")) {
                mediaInformationBox.addBox(new VideoMediaHeaderBox());
            } else if (uep0Var6.getHandler().equals("soun")) {
                mediaInformationBox.addBox(new SoundMediaHeaderBox());
            } else if (uep0Var6.getHandler().equals("text")) {
                mediaInformationBox.addBox(new NullMediaHeaderBox());
            } else if (uep0Var6.getHandler().equals("subt")) {
                mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
            } else if (uep0Var6.getHandler().equals("hint")) {
                mediaInformationBox.addBox(new HintMediaHeaderBox());
            } else if (uep0Var6.getHandler().equals("sbtl")) {
                mediaInformationBox.addBox(new NullMediaHeaderBox());
            }
            ?? dataInformationBox = new DataInformationBox();
            DataReferenceBox dataReferenceBox = new DataReferenceBox();
            dataInformationBox.addBox(dataReferenceBox);
            DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
            dataEntryUrlBox.setFlags(1);
            dataReferenceBox.addBox(dataEntryUrlBox);
            mediaInformationBox.addBox(dataInformationBox);
            ?? sampleTableBox = new SampleTableBox();
            sampleTableBox.addBox(uep0Var6.getSampleDescriptionBox());
            ArrayList arrayList2 = new ArrayList();
            long[] Q32 = uep0Var6.Q3();
            int length2 = Q32.length;
            ?? r5 = z3;
            TimeToSampleBox.a aVar2 = null;
            MediaBox mediaBox2 = mediaBox;
            Object obj3 = mediaInformationBox;
            ga8 ga8Var = trackBox;
            ?? r22 = z3;
            while (r5 < length2) {
                Object obj4 = obj3;
                HashMap<uep0, long[]> hashMap10 = hashMap;
                q100 q100Var8 = q100Var;
                MovieBox movieBox6 = movieBox;
                HashMap hashMap11 = hashMap3;
                MediaBox mediaBox3 = mediaBox2;
                uep0 uep0Var7 = uep0Var6;
                BasicContainer basicContainer5 = basicContainer;
                ga8 ga8Var2 = ga8Var;
                long j17 = Q32[r5];
                if (aVar2 == null || aVar2.b != j17) {
                    aVar2 = new TimeToSampleBox.a(1L, j17);
                    arrayList2.add(aVar2);
                } else {
                    aVar2.a++;
                }
                r5++;
                ga8Var = ga8Var2;
                uep0Var6 = uep0Var7;
                mediaBox2 = mediaBox3;
                movieBox = movieBox6;
                basicContainer = basicContainer5;
                hashMap = hashMap10;
                j10 = 1;
                r22 = 0;
                q100Var = q100Var8;
                hashMap3 = hashMap11;
                obj3 = obj4;
            }
            TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
            timeToSampleBox.setEntries(arrayList2);
            sampleTableBox.addBox(timeToSampleBox);
            ArrayList M = uep0Var6.M();
            if (M != null && !M.isEmpty()) {
                CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
                compositionTimeToSample.setEntries(M);
                sampleTableBox.addBox(compositionTimeToSample);
            }
            long[] B32 = uep0Var6.B3();
            if (B32 != null && B32.length > 0) {
                SyncSampleBox syncSampleBox = new SyncSampleBox();
                syncSampleBox.setSampleNumber(B32);
                sampleTableBox.addBox(syncSampleBox);
            }
            if (uep0Var6.r2() != null && !uep0Var6.r2().isEmpty()) {
                SampleDependencyTypeBox sampleDependencyTypeBox = new SampleDependencyTypeBox();
                sampleDependencyTypeBox.setEntries(uep0Var6.r2());
                sampleTableBox.addBox(sampleDependencyTypeBox);
            }
            int[] iArr2 = (int[]) hashMap8.get(uep0Var6);
            SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
            sampleToChunkBox.setEntries(new LinkedList());
            long j18 = -2147483648L;
            int i13 = r22;
            MediaBox mediaBox4 = mediaBox2;
            Object obj5 = obj3;
            ga8 ga8Var3 = ga8Var;
            int i14 = r22;
            while (i13 < iArr2.length) {
                Object obj6 = obj5;
                HashMap<uep0, long[]> hashMap12 = hashMap;
                q100 q100Var9 = q100Var;
                MovieBox movieBox7 = movieBox;
                HashMap hashMap13 = hashMap3;
                MediaBox mediaBox5 = mediaBox4;
                uep0 uep0Var8 = uep0Var6;
                BasicContainer basicContainer6 = basicContainer;
                ga8 ga8Var4 = ga8Var3;
                if (j18 != iArr2[i13]) {
                    sampleToChunkBox.getEntries().add(new SampleToChunkBox.a(i13 + 1, iArr2[i13], 1L));
                    j18 = iArr2[i13];
                }
                i13++;
                ga8Var3 = ga8Var4;
                uep0Var6 = uep0Var8;
                mediaBox4 = mediaBox5;
                obj5 = obj6;
                movieBox = movieBox7;
                basicContainer = basicContainer6;
                hashMap = hashMap12;
                j10 = 1;
                i14 = 0;
                q100Var = q100Var9;
                hashMap3 = hashMap13;
            }
            sampleTableBox.addBox(sampleToChunkBox);
            SampleSizeBox sampleSizeBox = new SampleSizeBox();
            sampleSizeBox.setSampleSizes(hashMap.get(uep0Var6));
            sampleTableBox.addBox(sampleSizeBox);
            Integer valueOf = Integer.valueOf(i14);
            HashMap hashMap14 = hashMap3;
            if (hashMap14.get(uep0Var6) == null) {
                q100Var2 = q100Var;
                q100Var2.b("Calculating chunk offsets for track_" + uep0Var6.i3().i);
                ArrayList arrayList3 = new ArrayList(hashMap8.keySet());
                Collections.sort(arrayList3, new xil());
                HashMap hashMap15 = new HashMap();
                HashMap hashMap16 = new HashMap();
                HashMap hashMap17 = new HashMap();
                Iterator it9 = arrayList3.iterator();
                ga8 ga8Var5 = ga8Var3;
                while (it9.hasNext()) {
                    ga8 ga8Var6 = ga8Var5;
                    uep0 uep0Var9 = (uep0) it9.next();
                    hashMap15.put(uep0Var9, valueOf);
                    hashMap16.put(uep0Var9, valueOf);
                    hashMap17.put(uep0Var9, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
                    hashMap14.put(uep0Var9, new StaticChunkOffsetBox());
                    ga8Var5 = ga8Var6;
                    hashMap = hashMap;
                }
                long j19 = 0;
                ga8 ga8Var7 = ga8Var5;
                while (true) {
                    Iterator it10 = arrayList3.iterator();
                    uep0 uep0Var10 = null;
                    ga8Var3 = ga8Var7;
                    while (it10.hasNext()) {
                        ga8 ga8Var8 = ga8Var3;
                        HashMap<uep0, long[]> hashMap18 = hashMap;
                        ArrayList arrayList4 = arrayList3;
                        BasicContainer basicContainer7 = basicContainer;
                        uep0 uep0Var11 = (uep0) it10.next();
                        if ((uep0Var10 == null || ((Double) hashMap17.get(uep0Var11)).doubleValue() < ((Double) hashMap17.get(uep0Var10)).doubleValue()) && ((Integer) hashMap15.get(uep0Var11)).intValue() < ((int[]) hashMap8.get(uep0Var11)).length) {
                            uep0Var10 = uep0Var11;
                        }
                        arrayList3 = arrayList4;
                        basicContainer = basicContainer7;
                        ga8Var3 = ga8Var8;
                        hashMap = hashMap18;
                    }
                    if (uep0Var10 == null) {
                        break;
                    }
                    ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) hashMap14.get(uep0Var10);
                    ArrayList arrayList5 = arrayList3;
                    long[] chunkOffsets = chunkOffsetBox.getChunkOffsets();
                    ga8 ga8Var9 = ga8Var3;
                    BasicContainer basicContainer8 = basicContainer;
                    long[] jArr5 = new long[1];
                    jArr5[i14] = j19;
                    chunkOffsetBox.setChunkOffsets(skd.b(chunkOffsets, jArr5));
                    int intValue = ((Integer) hashMap15.get(uep0Var10)).intValue();
                    int i15 = ((int[]) hashMap8.get(uep0Var10))[intValue];
                    int intValue2 = ((Integer) hashMap16.get(uep0Var10)).intValue();
                    double doubleValue = ((Double) hashMap17.get(uep0Var10)).doubleValue();
                    long[] Q33 = uep0Var10.Q3();
                    int i16 = intValue2;
                    while (true) {
                        i = intValue2 + i15;
                        if (i16 >= i) {
                            break;
                        }
                        j19 += hashMap.get(uep0Var10)[i16];
                        doubleValue = (Q33[r7] / uep0Var10.i3().c) + doubleValue;
                        i16++;
                        hashMap = hashMap;
                    }
                    hashMap15.put(uep0Var10, Integer.valueOf(intValue + 1));
                    hashMap16.put(uep0Var10, Integer.valueOf(i));
                    hashMap17.put(uep0Var10, Double.valueOf(doubleValue));
                    arrayList3 = arrayList5;
                    basicContainer = basicContainer8;
                    ga8Var7 = ga8Var9;
                }
            } else {
                q100Var2 = q100Var;
            }
            ga8 ga8Var10 = ga8Var3;
            HashMap<uep0, long[]> hashMap19 = hashMap;
            BasicContainer basicContainer9 = basicContainer;
            sampleTableBox.addBox((ga8) hashMap14.get(uep0Var6));
            HashMap hashMap20 = new HashMap();
            MediaBox mediaBox6 = mediaBox4;
            Object obj7 = obj5;
            int i17 = i14;
            for (Map.Entry<vju, long[]> entry : uep0Var6.T2().entrySet()) {
                Object obj8 = obj7;
                uep0 uep0Var12 = uep0Var6;
                MovieBox movieBox8 = movieBox;
                ga8 ga8Var11 = ga8Var10;
                MediaBox mediaBox7 = mediaBox6;
                String b2 = entry.getKey().b();
                List list = (List) hashMap20.get(b2);
                if (list == null) {
                    list = new ArrayList();
                    hashMap20.put(b2, list);
                }
                list.add(entry.getKey());
                ga8Var10 = ga8Var11;
                uep0Var6 = uep0Var12;
                mediaBox6 = mediaBox7;
                obj7 = obj8;
                movieBox = movieBox8;
                j10 = 1;
                i17 = 0;
            }
            ?? r0 = mediaBox6;
            ?? r1 = obj7;
            int i18 = i17;
            for (Map.Entry entry2 : hashMap20.entrySet()) {
                uep0 uep0Var13 = uep0Var6;
                MovieBox movieBox9 = movieBox;
                ga8 ga8Var12 = ga8Var10;
                SampleGroupDescriptionBox sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
                String str = (String) entry2.getKey();
                sampleGroupDescriptionBox.setGroupingType(str);
                sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
                SampleToGroupBox sampleToGroupBox = new SampleToGroupBox();
                sampleToGroupBox.setGroupingType(str);
                int i19 = 0;
                SampleToGroupBox.a aVar3 = null;
                Object obj9 = r0;
                Object obj10 = r1;
                while (i19 < uep0Var13.K().size()) {
                    int i20 = 0;
                    int i21 = 0;
                    Object obj11 = obj9;
                    Object obj12 = obj10;
                    while (i20 < ((List) entry2.getValue()).size()) {
                        Object obj13 = obj11;
                        Object obj14 = obj12;
                        MovieBox movieBox10 = movieBox9;
                        if (Arrays.binarySearch(uep0Var13.T2().get((vju) ((List) entry2.getValue()).get(i20)), i19) >= 0) {
                            i21 = i20 + 1;
                        }
                        i20++;
                        obj11 = obj13;
                        obj12 = obj14;
                        movieBox9 = movieBox10;
                        j10 = 1;
                    }
                    if (aVar3 == null || aVar3.b != i21) {
                        obj = obj11;
                        obj2 = obj12;
                        aVar3 = new SampleToGroupBox.a(j10, i21);
                        sampleToGroupBox.getEntries().add(aVar3);
                    } else {
                        aVar3.a += j10;
                        obj = obj11;
                        obj2 = obj12;
                    }
                    i19++;
                    obj9 = obj;
                    obj10 = obj2;
                    j10 = 1;
                }
                sampleTableBox.addBox(sampleGroupDescriptionBox);
                sampleTableBox.addBox(sampleToGroupBox);
                movieBox = movieBox9;
                ga8Var10 = ga8Var12;
                uep0Var6 = uep0Var13;
                i18 = 0;
                r0 = obj9;
                r1 = obj10;
            }
            if (uep0Var6 instanceof ipa) {
                ipa ipaVar = (ipa) uep0Var6;
                int[] iArr3 = (int[]) hashMap8.get(uep0Var6);
                SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = new SampleAuxiliaryInformationSizesBox();
                sampleAuxiliaryInformationSizesBox.setAuxInfoType(C.CENC_TYPE_cenc);
                sampleAuxiliaryInformationSizesBox.setFlags(1);
                ArrayList m2 = ipaVar.m2();
                sampleAuxiliaryInformationSizesBox.setDefaultSampleInfoSize(8);
                sampleAuxiliaryInformationSizesBox.setSampleCount(ipaVar.K().size());
                SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = new SampleAuxiliaryInformationOffsetsBox();
                ?? sampleEncryptionBox = new SampleEncryptionBox();
                sampleEncryptionBox.setSubSampleEncryption(i18);
                sampleEncryptionBox.setEntries(m2);
                long offsetToFirstIV = sampleEncryptionBox.getOffsetToFirstIV();
                long[] jArr6 = new long[iArr3.length];
                uep0Var = uep0Var6;
                int i22 = 0;
                int i23 = 0;
                while (i22 < iArr3.length) {
                    jArr6[i22] = offsetToFirstIV;
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox2 = sampleAuxiliaryInformationOffsetsBox;
                    int i24 = 0;
                    while (i24 < iArr3[i22]) {
                        offsetToFirstIV += ((kpa) m2.get(i23)).b();
                        i24++;
                        i23++;
                    }
                    i22++;
                    sampleAuxiliaryInformationOffsetsBox = sampleAuxiliaryInformationOffsetsBox2;
                }
                sampleAuxiliaryInformationOffsetsBox.setOffsets(jArr6);
                sampleTableBox.addBox(sampleAuxiliaryInformationSizesBox);
                sampleTableBox.addBox(sampleAuxiliaryInformationOffsetsBox);
                sampleTableBox.addBox(sampleEncryptionBox);
                hashSet2.add(sampleAuxiliaryInformationOffsetsBox);
            } else {
                uep0Var = uep0Var6;
            }
            if (uep0Var.E3() != null) {
                sampleTableBox.addBox(uep0Var.E3());
            }
            q100Var2.b("done with stbl for track_" + uep0Var.i3().i);
            r1.addBox(sampleTableBox);
            r0.addBox(r1);
            q100Var2.b("done with trak for track_" + uep0Var.i3().i);
            MovieBox movieBox11 = movieBox;
            movieBox11.addBox(ga8Var10);
            defaultMp4Builder = this;
            movieBox2 = movieBox11;
            q100Var3 = q100Var2;
            hashMap4 = hashMap8;
            it4 = it;
            basicContainer = basicContainer9;
            hashMap = hashMap19;
            z2 = true;
            z = false;
            pc30Var2 = pc30Var;
        }
        basicContainer.addBox(movieBox2);
        Iterator it11 = bq90.c(movieBox2, "trak/mdia/minf/stbl/stsz", z).iterator();
        long j20 = 0;
        while (it11.hasNext()) {
            HashMap hashMap21 = hashMap4;
            long j21 = j20;
            pc30 pc30Var4 = pc30Var2;
            long[] sampleSizes = ((SampleSizeBox) it11.next()).getSampleSizes();
            int length3 = sampleSizes.length;
            long j22 = 0;
            for (int i25 = z ? 1 : 0; i25 < length3; i25++) {
                j22 += sampleSizes[i25];
            }
            pc30Var2 = pc30Var4;
            j20 = j21 + j22;
            defaultMp4Builder = this;
            hashMap4 = hashMap21;
        }
        q100Var3.b("About to create mdat");
        InterleaveChunkMdat interleaveChunkMdat = new InterleaveChunkMdat(defaultMp4Builder, pc30Var2, hashMap4, j20, null);
        basicContainer.addBox(interleaveChunkMdat);
        q100Var3.b("mdat crated");
        long dataOffset = interleaveChunkMdat.getDataOffset();
        Iterator it12 = hashMap2.values().iterator();
        while (it12.hasNext()) {
            long[] chunkOffsets2 = ((StaticChunkOffsetBox) it12.next()).getChunkOffsets();
            for (int i26 = z ? 1 : 0; i26 < chunkOffsets2.length; i26++) {
                chunkOffsets2[i26] = chunkOffsets2[i26] + dataOffset;
            }
        }
        Iterator it13 = hashSet.iterator();
        while (it13.hasNext()) {
            SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox3 = (SampleAuxiliaryInformationOffsetsBox) it13.next();
            long size2 = sampleAuxiliaryInformationOffsetsBox3.getSize() + 44;
            SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox4 = sampleAuxiliaryInformationOffsetsBox3;
            while (true) {
                ?? parent = sampleAuxiliaryInformationOffsetsBox4.getParent();
                Iterator<ga8> it14 = parent.getBoxes().iterator();
                while (it14.hasNext() && (next = it14.next()) != sampleAuxiliaryInformationOffsetsBox4) {
                    size2 += next.getSize();
                }
                if (!(parent instanceof ga8)) {
                    break;
                }
                sampleAuxiliaryInformationOffsetsBox4 = parent;
            }
            long[] offsets = sampleAuxiliaryInformationOffsetsBox3.getOffsets();
            for (int i27 = z ? 1 : 0; i27 < offsets.length; i27++) {
                offsets[i27] = offsets[i27] + size2;
            }
            sampleAuxiliaryInformationOffsetsBox3.setOffsets(offsets);
        }
        return basicContainer;
    }
}
