package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.results.R;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import com.squareup.wire.ProtoAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q1f implements c6h, lx4, zzqp, zzyh, gml, gg3, op3, ol6, g18, m1g, f {
    public static final q1f b = new q1f(1);
    public static final q1f c = new q1f(2);
    public static final /* synthetic */ q1f d = new q1f(3);
    public static final /* synthetic */ q1f e = new q1f(5);
    public static final q1f f = new q1f(6);
    public static final q1f g = new q1f(7);
    public static final nal h = new nal();
    public static final q1f i = new q1f(9);
    public static final q1f j = new q1f(10);
    public static final q1f k = new q1f(11);
    public static final q1f l = new q1f(12);
    public static final q1f m = new q1f(13);
    public static final q1f n = new q1f(14);
    public final /* synthetic */ int a;

    public /* synthetic */ q1f(int i2) {
        this.a = i2;
    }

    public static xqc b(String str, brc brcVar, Double d2, Double d3, Double d4, int i2) {
        boolean z = (i2 & 512) == 0;
        Double valueOf = Double.valueOf(300.0d);
        return new xqc(str, brcVar, new arc(d2 != null ? d2.doubleValue() : 0.0d, d3 != null ? d3.doubleValue() : 0.0d, d4 == null ? (z && d4 == null) ? valueOf : null : d4), new arc(0.0d, 0.0d, z ? valueOf : null), z);
    }

    public static d6d h(fl5 fl5Var, s6d s6dVar, Bundle bundle, e6b e6bVar, l6d l6dVar) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        s6dVar.getClass();
        e6bVar.getClass();
        return new d6d(fl5Var, s6dVar, bundle, e6bVar, l6dVar, uuid, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gc2 j(String str) {
        int i2;
        char charAt;
        str.getClass();
        byte[] bArr = d.a;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 < length) {
                char charAt2 = str.charAt(i4);
                if ('A' <= charAt2 && charAt2 < '[') {
                    i2 = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i2 = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i2 = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i2 = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i2 = 63;
                } else {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        break;
                    }
                    i4++;
                }
                i6 = (i6 << 6) | i2;
                i5++;
                if (i5 % 4 == 0) {
                    bArr2[i7] = (byte) (i6 >> 16);
                    int i8 = i7 + 2;
                    bArr2[i7 + 1] = (byte) (i6 >> 8);
                    i7 += 3;
                    bArr2[i8] = (byte) i6;
                }
                i4++;
            } else {
                int i9 = i5 % 4;
                if (i9 != 1) {
                    if (i9 == 2) {
                        bArr2[i7] = (byte) ((i6 << 12) >> 16);
                        i7++;
                    } else if (i9 == 3) {
                        int i10 = i6 << 6;
                        int i11 = i7 + 1;
                        bArr2[i7] = (byte) (i10 >> 16);
                        i7 += 2;
                        bArr2[i11] = (byte) (i10 >> 8);
                    }
                    if (i7 != i3) {
                        bArr2 = Arrays.copyOf(bArr2, i7);
                    }
                }
            }
        }
        if (bArr2 != null) {
            return new gc2(bArr2);
        }
        return null;
    }

    public static gc2 m(String str) {
        str.getClass();
        if (str.length() % 2 != 0) {
            ogj.h("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (wnn.C(str.charAt(i3 + 1)) + (wnn.C(str.charAt(i3)) << 4));
        }
        return new gc2(bArr);
    }

    public static gc2 o(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        gc2 gc2Var = new gc2(bytes);
        gc2Var.c = str;
        return gc2Var;
    }

    public static ut q(String str) {
        Object obj;
        str.getClass();
        Iterator<E> it = ut.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((ut) obj).name(), str)) {
                break;
            }
        }
        ut utVar = (ut) obj;
        return utVar == null ? (ut) CollectionsKt.Y(ut.f) : utVar;
    }

    public static gc2 r(byte... bArr) {
        bArr.getClass();
        return new gc2(Arrays.copyOf(bArr, bArr.length));
    }

    public static gc2 s(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        yqo.x(bArr.length, 0L, length);
        return new gc2(mh0.k(0, length, bArr));
    }

    public static void u(Context context, int i2, MediaType mediaType, String str, String str2, boolean z, ArrayList arrayList, boolean z2, Integer num, int i3) {
        int i4 = MediaHighlightsActivity.a0;
        Integer valueOf = Integer.valueOf(R.string.all_videos);
        if ((i3 & 64) != 0) {
            arrayList = null;
        }
        if ((i3 & 128) != 0) {
            valueOf = null;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z2 = false;
        }
        if ((i3 & 512) != 0) {
            num = null;
        }
        Integer num2 = (i3 & 1024) != 0 ? null : 16;
        String str3 = (i3 & a.o) != 0 ? null : "featured_videos";
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) MediaHighlightsActivity.class);
        intent.putExtra("highlight_id", i2);
        intent.putExtra("media_type_ordinal", mediaType != null ? Integer.valueOf(mediaType.ordinal()) : null);
        intent.putExtra("highlight_url", str);
        intent.putExtra("highlight_title", str2);
        intent.putExtra("highlight_embeddable", z);
        intent.putExtra("title", valueOf);
        intent.putExtra("influencer_video_post", z2);
        intent.putExtra("tournament_team_id", num);
        intent.putExtra("tournament_id", num2);
        intent.putExtra("analytics_location", str3);
        if (arrayList != null) {
            intent.putIntegerArrayListExtra("media_post_group_ids", new ArrayList<>(arrayList));
        }
        context.startActivity(intent);
    }

    @Override // defpackage.lx4
    public float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.g18
    public Class c() {
        return InputStream.class;
    }

    @Override // defpackage.ol6
    public void d(a0h a0hVar) {
        switch (this.a) {
            case 21:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.op3
    public long e(long j2, long j3) {
        float y = rfo.y(j2, j3);
        long floatToRawIntBits = (Float.floatToRawIntBits(y) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
        int i2 = mrg.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.ol6, defpackage.pl6
    public void endTracks() {
        switch (this.a) {
            case 21:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.g18
    public void f(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // defpackage.m1g
    public int g(uvd uvdVar) {
        return 1;
    }

    @Override // defpackage.c6h
    public Object getDefaultValue() {
        return null;
    }

    @Override // defpackage.gn5
    public boolean i(Object obj, File file, uvd uvdVar) {
        try {
            ha2.d(((dy8) ((xx8) ((e1g) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    @Override // defpackage.gml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1 k(String str, int i2, EnumMap enumMap) {
        char c2;
        int i3;
        int i4;
        int i5;
        kw1 kw1Var;
        int i6;
        int i7;
        int i8;
        kw1 D;
        int i9;
        int i10;
        int i11;
        LinkedList a;
        Charset charset = StandardCharsets.ISO_8859_1;
        cn5 cn5Var = cn5.b;
        if (enumMap.containsKey(cn5Var)) {
            charset = Charset.forName(enumMap.get(cn5Var).toString());
        }
        cn5 cn5Var2 = cn5.a;
        int parseInt = enumMap.containsKey(cn5Var2) ? Integer.parseInt(enumMap.get(cn5Var2).toString()) : 33;
        cn5 cn5Var3 = cn5.j;
        int parseInt2 = enumMap.containsKey(cn5Var3) ? Integer.parseInt(enumMap.get(cn5Var3).toString()) : 0;
        int i12 = 1;
        if (i2 != 1) {
            a70.p("Can only encode AZTEC, but got ".concat(fn0.C(i2)));
            return null;
        }
        byte[] bytes = str.getBytes(charset);
        int[] iArr = rz8.g;
        List<bdi> singletonList = Collections.singletonList(bdi.e);
        int i13 = 0;
        while (true) {
            int i14 = 4;
            int i15 = 2;
            c2 = '\n';
            i3 = 3;
            if (i13 >= bytes.length) {
                break;
            }
            int i16 = i13 + 1;
            byte b2 = i16 < bytes.length ? bytes[i16] : (byte) 0;
            byte b3 = bytes[i13];
            if (b3 == 13) {
                if (b2 == 10) {
                    i10 = 2;
                    if (i10 <= 0) {
                    }
                    singletonList = a;
                    i13++;
                    i12 = i11;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                singletonList = a;
                i13++;
                i12 = i11;
            } else if (b3 == 44) {
                if (b2 == 32) {
                    i10 = 4;
                    if (i10 <= 0) {
                    }
                    singletonList = a;
                    i13++;
                    i12 = i11;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                singletonList = a;
                i13++;
                i12 = i11;
            } else if (b3 != 46) {
                if (b3 == 58 && b2 == 32) {
                    i10 = 5;
                    if (i10 <= 0) {
                        LinkedList linkedList = new LinkedList();
                        for (bdi bdiVar : singletonList) {
                            bdi b4 = bdiVar.b(i13);
                            linkedList.add(b4.d(4, i10));
                            if (bdiVar.a != 4) {
                                linkedList.add(b4.e(4, i10));
                            }
                            if (i10 == 3 || i10 == 4) {
                                linkedList.add(b4.d(2, 16 - i10).d(2, i12));
                            }
                            if (bdiVar.c > 0) {
                                linkedList.add(bdiVar.a(i13).a(i16));
                            }
                        }
                        a = ba9.a(linkedList);
                        i11 = i12;
                        i13 = i16;
                    } else {
                        LinkedList linkedList2 = new LinkedList();
                        for (bdi bdiVar2 : singletonList) {
                            char c3 = (char) (bytes[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            int[][] iArr2 = ba9.c;
                            int i17 = bdiVar2.a;
                            int i18 = iArr2[i17][c3] > 0 ? i12 : 0;
                            bdi bdiVar3 = null;
                            int i19 = 0;
                            while (i19 <= i14) {
                                int i20 = i12;
                                int i21 = iArr2[i19][c3];
                                if (i21 > 0) {
                                    if (bdiVar3 == null) {
                                        bdiVar3 = bdiVar2.b(i13);
                                    }
                                    bdi bdiVar4 = bdiVar3;
                                    if (i18 == 0 || i19 == i17 || i19 == i15) {
                                        linkedList2.add(bdiVar4.d(i19, i21));
                                    }
                                    if (i18 == 0 && ba9.d[i17][i19] >= 0) {
                                        linkedList2.add(bdiVar4.e(i19, i21));
                                    }
                                    bdiVar3 = bdiVar4;
                                }
                                i19++;
                                i12 = i20;
                                i14 = 4;
                                i15 = 2;
                            }
                            int i22 = i12;
                            if (bdiVar2.c > 0 || iArr2[i17][c3] == 0) {
                                linkedList2.add(bdiVar2.a(i13));
                            }
                            i12 = i22;
                            i14 = 4;
                            i15 = 2;
                        }
                        i11 = i12;
                        a = ba9.a(linkedList2);
                    }
                    singletonList = a;
                    i13++;
                    i12 = i11;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                singletonList = a;
                i13++;
                i12 = i11;
            } else {
                if (b2 == 32) {
                    i10 = 3;
                    if (i10 <= 0) {
                    }
                    singletonList = a;
                    i13++;
                    i12 = i11;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                singletonList = a;
                i13++;
                i12 = i11;
            }
        }
        int i23 = i12;
        bdi bdiVar5 = (bdi) Collections.min(singletonList, new se7(14));
        bdiVar5.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (xjj xjjVar = bdiVar5.b(bytes.length).b; xjjVar != null; xjjVar = xjjVar.a) {
            linkedList3.addFirst(xjjVar);
        }
        kw1 kw1Var2 = new kw1();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((xjj) it.next()).a(kw1Var2, bytes);
        }
        int i24 = kw1Var2.b;
        int c4 = vxd.c(i24, parseInt, 100, 11);
        int i25 = i24 + c4;
        if (parseInt2 == 0) {
            kw1 kw1Var3 = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 <= 32) {
                int i28 = i26 <= i3 ? i23 : 0;
                int i29 = i28 != 0 ? i26 + 1 : i26;
                int i30 = ((i28 != 0 ? 88 : 112) + (i29 << 4)) * i29;
                if (i25 <= i30) {
                    if (kw1Var3 == null || i27 != iArr[i29]) {
                        i4 = iArr[i29];
                        kw1Var3 = rz8.V(kw1Var2, i4);
                    } else {
                        i4 = i27;
                    }
                    int i31 = i30 - (i30 % i4);
                    if ((i28 == 0 || kw1Var3.b <= (i4 << 6)) && kw1Var3.b + c4 <= i31) {
                        i5 = i4;
                        kw1Var = kw1Var3;
                        i6 = i28;
                        i7 = i29;
                        i8 = i30;
                    } else {
                        i27 = i4;
                    }
                }
                i26++;
                c2 = c2;
                i3 = 3;
            }
            a70.p("Data too large for an Aztec code");
            return null;
        }
        i6 = parseInt2 < 0 ? i23 : 0;
        i7 = Math.abs(parseInt2);
        if (i7 > (i6 != 0 ? 4 : 32)) {
            a70.p(lnb.k(parseInt2, "Illegal value ", " for layers"));
            return null;
        }
        i8 = ((i6 != 0 ? 88 : 112) + (i7 << 4)) * i7;
        i5 = iArr[i7];
        int i32 = i8 - (i8 % i5);
        kw1Var = rz8.V(kw1Var2, i5);
        int i33 = kw1Var.b;
        if (c4 + i33 > i32) {
            a70.p("Data to large for user specified layer");
            return null;
        }
        if (i6 != 0 && i33 > (i5 << 6)) {
            a70.p("Data to large for user specified layer");
            return null;
        }
        kw1 D2 = rz8.D(kw1Var, i8, i5);
        int i34 = kw1Var.b / i5;
        kw1 kw1Var4 = new kw1();
        if (i6 != 0) {
            kw1Var4.b(i7 - 1, 2);
            kw1Var4.b(i34 - 1, 6);
            D = rz8.D(kw1Var4, 28, 4);
        } else {
            kw1Var4.b(i7 - 1, 5);
            kw1Var4.b(i34 - 1, 11);
            D = rz8.D(kw1Var4, 40, 4);
        }
        int i35 = (i6 != 0 ? 11 : 14) + (i7 << 2);
        int[] iArr3 = new int[i35];
        if (i6 != 0) {
            for (int i36 = 0; i36 < i35; i36++) {
                iArr3[i36] = i36;
            }
            i9 = i35;
        } else {
            int i37 = i35 / 2;
            i9 = (((i37 - 1) / 15) * 2) + i35 + 1;
            int i38 = i9 / 2;
            for (int i39 = 0; i39 < i37; i39++) {
                iArr3[(i37 - i39) - 1] = (i38 - r10) - 1;
                iArr3[i37 + i39] = (i39 / 15) + i39 + i38 + 1;
            }
        }
        lw1 lw1Var = new lw1(i9, i9);
        int i40 = 0;
        for (int i41 = 0; i41 < i7; i41++) {
            int i42 = ((i7 - i41) << 2) + (i6 != 0 ? 9 : 12);
            for (int i43 = 0; i43 < i42; i43++) {
                int i44 = i43 << 1;
                for (int i45 = 0; i45 < 2; i45++) {
                    if (D2.d(i40 + i44 + i45)) {
                        int i46 = i41 << 1;
                        lw1Var.b(iArr3[i46 + i45], iArr3[i46 + i43]);
                    }
                    if (D2.d((i42 << 1) + i40 + i44 + i45)) {
                        int i47 = i41 << 1;
                        lw1Var.b(iArr3[i47 + i43], iArr3[((i35 - 1) - i47) - i45]);
                    }
                    if (D2.d((i42 << 2) + i40 + i44 + i45)) {
                        int i48 = (i35 - 1) - (i41 << 1);
                        lw1Var.b(iArr3[i48 - i45], iArr3[i48 - i43]);
                    }
                    if (D2.d((i42 * 6) + i40 + i44 + i45)) {
                        int i49 = i41 << 1;
                        lw1Var.b(iArr3[((i35 - 1) - i49) - i43], iArr3[i49 + i45]);
                    }
                }
            }
            i40 += i42 << 3;
        }
        int i50 = i9 / 2;
        if (i6 != 0) {
            for (int i51 = 0; i51 < 7; i51++) {
                int i52 = (i50 - 3) + i51;
                if (D.d(i51)) {
                    lw1Var.b(i52, i50 - 5);
                }
                if (D.d(i51 + 7)) {
                    lw1Var.b(i50 + 5, i52);
                }
                if (D.d(20 - i51)) {
                    lw1Var.b(i52, i50 + 5);
                }
                if (D.d(27 - i51)) {
                    lw1Var.b(i50 - 5, i52);
                }
            }
        } else {
            for (int i53 = 0; i53 < 10; i53++) {
                int i54 = (i53 / 5) + (i50 - 5) + i53;
                if (D.d(i53)) {
                    lw1Var.b(i54, i50 - 7);
                }
                if (D.d(i53 + 10)) {
                    lw1Var.b(i50 + 7, i54);
                }
                if (D.d(29 - i53)) {
                    lw1Var.b(i54, i50 + 7);
                }
                if (D.d(39 - i53)) {
                    lw1Var.b(i50 - 7, i54);
                }
            }
        }
        if (i6 != 0) {
            rz8.B(lw1Var, i50, 5);
        } else {
            rz8.B(lw1Var, i50, 7);
            int i55 = 0;
            int i56 = 0;
            while (i55 < (i35 / 2) - 1) {
                for (int i57 = i50 & 1; i57 < i9; i57 += 2) {
                    int i58 = i50 - i56;
                    lw1Var.b(i58, i57);
                    int i59 = i50 + i56;
                    lw1Var.b(i59, i57);
                    lw1Var.b(i57, i58);
                    lw1Var.b(i57, i59);
                }
                i55 += 15;
                i56 += 16;
            }
        }
        int i60 = lw1Var.a;
        int max = Math.max(200, i60);
        int i61 = lw1Var.b;
        int max2 = Math.max(200, i61);
        int min = Math.min(max / i60, max2 / i61);
        int i62 = (max - (i60 * min)) / 2;
        int i63 = (max2 - (i61 * min)) / 2;
        lw1 lw1Var2 = new lw1(max, max2);
        int i64 = 0;
        while (i64 < i61) {
            int i65 = i62;
            int i66 = 0;
            while (i66 < i60) {
                if (lw1Var.a(i66, i64)) {
                    lw1Var2.c(i65, i63, min, min);
                }
                i66++;
                i65 += min;
            }
            i64++;
            i63 += min;
        }
        return lw1Var2;
    }

    @Override // defpackage.hg3
    public int l(f7 f7Var, int i2, Object obj, int i3) {
        f7Var.t((byte[]) obj, i3, i2);
        return i3 + i2;
    }

    @Override // defpackage.g18
    public Object n(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.c6h
    public Object readFrom(InputStream inputStream, rq3 rq3Var) {
        try {
            return BrandingConfig.ADAPTER.decode(inputStream);
        } catch (IOException e2) {
            s38.a().c(e2);
            return null;
        }
    }

    @Override // defpackage.ol6
    public usj track(int i2, int i3) {
        switch (this.a) {
            case 21:
                return new vd5();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.c6h
    public Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        ProtoAdapter adapter;
        BrandingConfig brandingConfig = (BrandingConfig) obj;
        if (brandingConfig != null && (adapter = brandingConfig.adapter()) != null) {
            adapter.encode(outputStream, (OutputStream) brandingConfig);
        }
        return Unit.a;
    }

    private final void p() {
    }

    private final void t(a0h a0hVar) {
    }
}
