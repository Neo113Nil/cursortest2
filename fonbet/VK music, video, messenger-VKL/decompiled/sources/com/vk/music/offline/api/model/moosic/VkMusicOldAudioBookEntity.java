package com.vk.music.offline.api.model.moosic;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookGenre;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.dto.music.audiobook.AudioBookPublisher;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookPersonEntity;
import com.vk.music.offline.api.model.moosic.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.asp;
import xsna.bh10;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.j5g;
import xsna.m900;
import xsna.qr;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.y5v0;
import xsna.z5v0;
import xsna.zrp;

/* compiled from: VkMusicOldAudioBookEntity.kt */
/* loaded from: classes3.dex */
public final class VkMusicOldAudioBookEntity {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final String i;
    public final Integer j;
    public final int k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final int p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMusicOldAudioBookEntity.kt */
    public static final class AccessStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccessStatus[] $VALUES;
        public static final AccessStatus FREE;
        public static final AccessStatus FREE_WHEN_STARTED;
        public static final AccessStatus PAID;

        /* compiled from: VkMusicOldAudioBookEntity.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccessStatus.values().length];
                try {
                    iArr[AccessStatus.FREE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccessStatus.PAID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccessStatus.FREE_WHEN_STARTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            AccessStatus accessStatus = new AccessStatus("FREE", 0);
            FREE = accessStatus;
            AccessStatus accessStatus2 = new AccessStatus("PAID", 1);
            PAID = accessStatus2;
            AccessStatus accessStatus3 = new AccessStatus("FREE_WHEN_STARTED", 2);
            FREE_WHEN_STARTED = accessStatus3;
            AccessStatus[] accessStatusArr = {accessStatus, accessStatus2, accessStatus3};
            $VALUES = accessStatusArr;
            $ENTRIES = new asp(accessStatusArr);
        }

        public AccessStatus() {
            throw null;
        }

        public static zrp<AccessStatus> h() {
            return $ENTRIES;
        }

        public static AccessStatus valueOf(String str) {
            return (AccessStatus) Enum.valueOf(AccessStatus.class, str);
        }

        public static AccessStatus[] values() {
            return (AccessStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMusicOldAudioBookEntity.kt */
    public static final class Flags {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Flags[] $VALUES;
        public static final Flags DOWNLOAD_IN_PROGRESS;
        public static final Flags EXPLICIT;
        public static final Flags IN_FAVORITES;
        public static final Flags LOADING_COMPLETE;
        public static final Flags STARTED_LISTENING;
        public static final Flags TRACKLIST_OUTDATED;
        public static final Flags TRACKLIST_READY;

        static {
            Flags flags = new Flags("IN_FAVORITES", 0);
            IN_FAVORITES = flags;
            Flags flags2 = new Flags("TRACKLIST_READY", 1);
            TRACKLIST_READY = flags2;
            Flags flags3 = new Flags("LOADING_COMPLETE", 2);
            LOADING_COMPLETE = flags3;
            Flags flags4 = new Flags("EXPLICIT", 3);
            EXPLICIT = flags4;
            Flags flags5 = new Flags("TRACKLIST_OUTDATED", 4);
            TRACKLIST_OUTDATED = flags5;
            Flags flags6 = new Flags("STARTED_LISTENING", 5);
            STARTED_LISTENING = flags6;
            Flags flags7 = new Flags("DOWNLOAD_IN_PROGRESS", 6);
            DOWNLOAD_IN_PROGRESS = flags7;
            Flags[] flagsArr = {flags, flags2, flags3, flags4, flags5, flags6, flags7};
            $VALUES = flagsArr;
            $ENTRIES = new asp(flagsArr);
        }

        public Flags() {
            throw null;
        }

        public static Flags valueOf(String str) {
            return (Flags) Enum.valueOf(Flags.class, str);
        }

        public static Flags[] values() {
            return (Flags[]) $VALUES.clone();
        }
    }

    /* compiled from: VkMusicOldAudioBookEntity.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:100:0x0224, code lost:
        
            if (r0 != null) goto L90;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static AudioBook a(VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity, int i) {
            Image image;
            String str;
            Object obj;
            AudioBooksAccessStatus audioBooksAccessStatus;
            Image image2;
            AudioBookPersonRole audioBookPersonRole;
            int i2 = vkMusicOldAudioBookEntity.k;
            ArrayList arrayList = vkMusicOldAudioBookEntity.m;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                int i3 = 1;
                if (!it.hasNext()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        List<AudioBookPersonRole> list = ((AudioBookPerson) next).f;
                        if (list != null && list.contains(AudioBookPersonRole.AUTHOR)) {
                            arrayList3.add(next);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        List<AudioBookPersonRole> list2 = ((AudioBookPerson) next2).f;
                        if (list2 != null && list2.contains(AudioBookPersonRole.NARRATOR)) {
                            arrayList4.add(next2);
                        }
                    }
                    String str2 = vkMusicOldAudioBookEntity.h;
                    if (str2 != null) {
                        String str3 = "photos_cache/" + i + '/' + str2;
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        String uri = Uri.fromFile(new File(context.getFilesDir(), str3)).toString();
                        m900<String, ImageSize> m900Var = ImageSize.e;
                        image = new Image((List<ImageSize>) Collections.singletonList(ImageSize.b.a(uri)));
                    } else {
                        image = null;
                    }
                    int i4 = vkMusicOldAudioBookEntity.b;
                    String str4 = vkMusicOldAudioBookEntity.c;
                    String str5 = vkMusicOldAudioBookEntity.d;
                    int i5 = vkMusicOldAudioBookEntity.e;
                    int ordinal = 1 << Flags.EXPLICIT.ordinal();
                    boolean z = ordinal == (i2 & ordinal);
                    int i6 = vkMusicOldAudioBookEntity.f / 1000;
                    int i7 = (int) vkMusicOldAudioBookEntity.g;
                    z5v0 z5v0Var = (z5v0) j5g.a0(vkMusicOldAudioBookEntity.n);
                    AudioBookPublisher audioBookPublisher = z5v0Var != null ? new AudioBookPublisher(z5v0Var.a, z5v0Var.b) : null;
                    ArrayList arrayList5 = vkMusicOldAudioBookEntity.l;
                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(a.C1328a.a((com.vk.music.offline.api.model.moosic.a) it4.next(), i));
                    }
                    ArrayList<y5v0> arrayList7 = vkMusicOldAudioBookEntity.o;
                    ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                    for (y5v0 y5v0Var : arrayList7) {
                        arrayList8.add(new AudioBookGenre(y5v0Var.a, y5v0Var.b));
                        i3 = i3;
                    }
                    int i8 = i3;
                    String str6 = vkMusicOldAudioBookEntity.i;
                    Integer num = vkMusicOldAudioBookEntity.j;
                    int ordinal2 = i8 << Flags.IN_FAVORITES.ordinal();
                    boolean z2 = ordinal2 == (i2 & ordinal2) ? i8 : 0;
                    Iterator<E> it5 = AccessStatus.h().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            str = str6;
                            obj = null;
                            break;
                        }
                        Object next3 = it5.next();
                        str = str6;
                        if (((AccessStatus) next3).ordinal() == vkMusicOldAudioBookEntity.p) {
                            obj = next3;
                            break;
                        }
                        str6 = str;
                    }
                    AccessStatus accessStatus = (AccessStatus) obj;
                    if (accessStatus != null) {
                        int i9 = AccessStatus.a.$EnumSwitchMapping$0[accessStatus.ordinal()];
                        if (i9 == i8) {
                            audioBooksAccessStatus = AudioBooksAccessStatus.FREE;
                        } else if (i9 == 2) {
                            audioBooksAccessStatus = AudioBooksAccessStatus.PAID;
                        } else {
                            if (i9 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            audioBooksAccessStatus = AudioBooksAccessStatus.STARTED;
                        }
                    }
                    audioBooksAccessStatus = AudioBooksAccessStatus.FREE;
                    return new AudioBook(i4, str4, str5, i5, z, i6, audioBookPublisher, i7, image, arrayList6, arrayList3, arrayList4, null, arrayList8, str, num, z2, audioBooksAccessStatus, "", 0, null, null);
                }
                VkMusicOldAudioBookPersonEntity vkMusicOldAudioBookPersonEntity = (VkMusicOldAudioBookPersonEntity) it.next();
                String str7 = vkMusicOldAudioBookPersonEntity.d;
                if (str7 != null) {
                    String str8 = "photos_cache/" + i + '/' + str7;
                    Context context2 = e43.a;
                    String uri2 = Uri.fromFile(new File((context2 != null ? context2 : null).getFilesDir(), str8)).toString();
                    m900<String, ImageSize> m900Var2 = ImageSize.e;
                    image2 = new Image((List<ImageSize>) Collections.singletonList(ImageSize.b.a(uri2)));
                } else {
                    image2 = null;
                }
                int i10 = vkMusicOldAudioBookPersonEntity.a;
                String str9 = vkMusicOldAudioBookPersonEntity.b;
                String str10 = vkMusicOldAudioBookPersonEntity.c;
                ListBuilder e = e43.e();
                VkMusicOldAudioBookPersonEntity.Role role = (VkMusicOldAudioBookPersonEntity.Role) j5g.b0(vkMusicOldAudioBookPersonEntity.e, VkMusicOldAudioBookPersonEntity.Role.h());
                if (role != null) {
                    int i11 = VkMusicOldAudioBookPersonEntity.a.$EnumSwitchMapping$0[role.ordinal()];
                    if (i11 == 1) {
                        audioBookPersonRole = AudioBookPersonRole.AUTHOR;
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        audioBookPersonRole = AudioBookPersonRole.NARRATOR;
                    }
                    e.add(audioBookPersonRole);
                }
                arrayList2.add(new AudioBookPerson(i10, str9, str10, image2, e.g(), 0));
            }
        }
    }

    public VkMusicOldAudioBookEntity(int i, int i2, String str, String str2, int i3, int i4, long j, String str3, String str4, Integer num, int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i6) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
        this.f = i4;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = num;
        this.k = i5;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = arrayList3;
        this.o = arrayList4;
        this.p = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMusicOldAudioBookEntity)) {
            return false;
        }
        VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity = (VkMusicOldAudioBookEntity) obj;
        return this.a == vkMusicOldAudioBookEntity.a && this.b == vkMusicOldAudioBookEntity.b && this.c.equals(vkMusicOldAudioBookEntity.c) && this.d.equals(vkMusicOldAudioBookEntity.d) && this.e == vkMusicOldAudioBookEntity.e && this.f == vkMusicOldAudioBookEntity.f && this.g == vkMusicOldAudioBookEntity.g && epx.f(this.h, vkMusicOldAudioBookEntity.h) && epx.f(this.i, vkMusicOldAudioBookEntity.i) && this.j.equals(vkMusicOldAudioBookEntity.j) && this.k == vkMusicOldAudioBookEntity.k && this.l.equals(vkMusicOldAudioBookEntity.l) && this.m.equals(vkMusicOldAudioBookEntity.m) && this.n.equals(vkMusicOldAudioBookEntity.n) && this.o.equals(vkMusicOldAudioBookEntity.o) && this.p == vkMusicOldAudioBookEntity.p;
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.f, shy.a(this.e, urd0.a(urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31), 31), 31, this.g);
        String str = this.h;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return Integer.hashCode(this.p) + qr.a(this.o, qr.a(this.n, qr.a(this.m, qr.a(this.l, shy.a(this.k, (this.j.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldAudioBookEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", annotation=");
        sb.append(this.d);
        sb.append(", minimumAge=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", updatedAt=");
        sb.append(this.g);
        sb.append(", coverId=");
        sb.append(this.h);
        sb.append(", copyright=");
        sb.append(this.i);
        sb.append(", releaseDate=");
        sb.append(this.j);
        sb.append(", flags=");
        sb.append(this.k);
        sb.append(", chapters=");
        sb.append(this.l);
        sb.append(", persons=");
        sb.append(this.m);
        sb.append(", publishers=");
        sb.append(this.n);
        sb.append(", genres=");
        sb.append(this.o);
        sb.append(", accessStatusOrdinal=");
        return vu5.b(sb, this.p, ')');
    }
}
