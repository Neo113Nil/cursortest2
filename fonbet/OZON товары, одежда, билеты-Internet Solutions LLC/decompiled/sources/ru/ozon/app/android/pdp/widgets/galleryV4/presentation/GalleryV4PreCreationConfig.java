package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import Am.C2438a;
import B0.C2454a;
import Ef0.c;
import Kk.C3532b;
import Pk0.a;
import Pk0.f;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J¾\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b\f\u0010.R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\r\u0010.R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b\u000e\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b/\u0010*R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b3\u0010.R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b4\u0010.R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b5\u0010.¨\u00066"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "", "", "height", "width", "defaultContainersWidth", "Ljava/util/Queue;", "containerWidthQueue", "infoContainerWidth", "ugcContainerWidth", "videoContainerWidth", "", "isBigStateInfo", "isVerticalStateUgc", "isCreateOnBoarding", "buttonsTintRes", "", "", "icons", "hasWave", "hasVideoContent", "hasDifferentContainers", "<init>", "(IIILjava/util/Queue;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/util/List;ZZZ)V", "copy", "(IIILjava/util/Queue;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/util/List;ZZZ)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "getWidth", "getDefaultContainersWidth", "Ljava/util/Queue;", "getContainerWidthQueue", "()Ljava/util/Queue;", "Ljava/lang/Integer;", "getInfoContainerWidth", "()Ljava/lang/Integer;", "getUgcContainerWidth", "getVideoContainerWidth", "Z", "()Z", "getButtonsTintRes", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getHasWave", "getHasVideoContent", "getHasDifferentContainers", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV4PreCreationConfig {
    private final Integer buttonsTintRes;
    private final Queue<Integer> containerWidthQueue;
    private final int defaultContainersWidth;
    private final boolean hasDifferentContainers;
    private final boolean hasVideoContent;
    private final boolean hasWave;
    private final int height;
    private final List<String> icons;
    private final Integer infoContainerWidth;
    private final boolean isBigStateInfo;
    private final boolean isCreateOnBoarding;
    private final boolean isVerticalStateUgc;
    private final Integer ugcContainerWidth;
    private final Integer videoContainerWidth;
    private final int width;

    public GalleryV4PreCreationConfig(int i11, int i12, int i13, Queue<Integer> queue, Integer num, Integer num2, Integer num3, boolean z11, boolean z12, boolean z13, Integer num4, List<String> list, boolean z14, boolean z15, boolean z16) {
        this.height = i11;
        this.width = i12;
        this.defaultContainersWidth = i13;
        this.containerWidthQueue = queue;
        this.infoContainerWidth = num;
        this.ugcContainerWidth = num2;
        this.videoContainerWidth = num3;
        this.isBigStateInfo = z11;
        this.isVerticalStateUgc = z12;
        this.isCreateOnBoarding = z13;
        this.buttonsTintRes = num4;
        this.icons = list;
        this.hasWave = z14;
        this.hasVideoContent = z15;
        this.hasDifferentContainers = z16;
    }

    @NotNull
    public final GalleryV4PreCreationConfig copy(int height, int width, int defaultContainersWidth, Queue<Integer> containerWidthQueue, Integer infoContainerWidth, Integer ugcContainerWidth, Integer videoContainerWidth, boolean isBigStateInfo, boolean isVerticalStateUgc, boolean isCreateOnBoarding, Integer buttonsTintRes, List<String> icons, boolean hasWave, boolean hasVideoContent, boolean hasDifferentContainers) {
        return new GalleryV4PreCreationConfig(height, width, defaultContainersWidth, containerWidthQueue, infoContainerWidth, ugcContainerWidth, videoContainerWidth, isBigStateInfo, isVerticalStateUgc, isCreateOnBoarding, buttonsTintRes, icons, hasWave, hasVideoContent, hasDifferentContainers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV4PreCreationConfig)) {
            return false;
        }
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = (GalleryV4PreCreationConfig) other;
        return this.height == galleryV4PreCreationConfig.height && this.width == galleryV4PreCreationConfig.width && this.defaultContainersWidth == galleryV4PreCreationConfig.defaultContainersWidth && Intrinsics.d(this.containerWidthQueue, galleryV4PreCreationConfig.containerWidthQueue) && Intrinsics.d(this.infoContainerWidth, galleryV4PreCreationConfig.infoContainerWidth) && Intrinsics.d(this.ugcContainerWidth, galleryV4PreCreationConfig.ugcContainerWidth) && Intrinsics.d(this.videoContainerWidth, galleryV4PreCreationConfig.videoContainerWidth) && this.isBigStateInfo == galleryV4PreCreationConfig.isBigStateInfo && this.isVerticalStateUgc == galleryV4PreCreationConfig.isVerticalStateUgc && this.isCreateOnBoarding == galleryV4PreCreationConfig.isCreateOnBoarding && Intrinsics.d(this.buttonsTintRes, galleryV4PreCreationConfig.buttonsTintRes) && Intrinsics.d(this.icons, galleryV4PreCreationConfig.icons) && this.hasWave == galleryV4PreCreationConfig.hasWave && this.hasVideoContent == galleryV4PreCreationConfig.hasVideoContent && this.hasDifferentContainers == galleryV4PreCreationConfig.hasDifferentContainers;
    }

    public final Integer getButtonsTintRes() {
        return this.buttonsTintRes;
    }

    public final Queue<Integer> getContainerWidthQueue() {
        return this.containerWidthQueue;
    }

    public final int getDefaultContainersWidth() {
        return this.defaultContainersWidth;
    }

    public final boolean getHasDifferentContainers() {
        return this.hasDifferentContainers;
    }

    public final boolean getHasVideoContent() {
        return this.hasVideoContent;
    }

    public final boolean getHasWave() {
        return this.hasWave;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List<String> getIcons() {
        return this.icons;
    }

    public final Integer getInfoContainerWidth() {
        return this.infoContainerWidth;
    }

    public final Integer getUgcContainerWidth() {
        return this.ugcContainerWidth;
    }

    public final Integer getVideoContainerWidth() {
        return this.videoContainerWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.defaultContainersWidth, C2454a.a(this.width, Integer.hashCode(this.height) * 31, 31), 31);
        Queue<Integer> queue = this.containerWidthQueue;
        int hashCode = (a11 + (queue == null ? 0 : queue.hashCode())) * 31;
        Integer num = this.infoContainerWidth;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ugcContainerWidth;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoContainerWidth;
        int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.isBigStateInfo), 31, this.isVerticalStateUgc), 31, this.isCreateOnBoarding);
        Integer num4 = this.buttonsTintRes;
        int hashCode4 = (a12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list = this.icons;
        return Boolean.hashCode(this.hasDifferentContainers) + C3532b.a(C3532b.a((hashCode4 + (list != null ? list.hashCode() : 0)) * 31, 31, this.hasWave), 31, this.hasVideoContent);
    }

    /* renamed from: isBigStateInfo, reason: from getter */
    public final boolean getIsBigStateInfo() {
        return this.isBigStateInfo;
    }

    /* renamed from: isCreateOnBoarding, reason: from getter */
    public final boolean getIsCreateOnBoarding() {
        return this.isCreateOnBoarding;
    }

    @NotNull
    public String toString() {
        int i11 = this.height;
        int i12 = this.width;
        int i13 = this.defaultContainersWidth;
        Queue<Integer> queue = this.containerWidthQueue;
        Integer num = this.infoContainerWidth;
        Integer num2 = this.ugcContainerWidth;
        Integer num3 = this.videoContainerWidth;
        boolean z11 = this.isBigStateInfo;
        boolean z12 = this.isVerticalStateUgc;
        boolean z13 = this.isCreateOnBoarding;
        Integer num4 = this.buttonsTintRes;
        List<String> list = this.icons;
        boolean z14 = this.hasWave;
        boolean z15 = this.hasVideoContent;
        boolean z16 = this.hasDifferentContainers;
        StringBuilder a11 = C2438a.a("GalleryV4PreCreationConfig(height=", i11, ", width=", ", defaultContainersWidth=", i12);
        a11.append(i13);
        a11.append(", containerWidthQueue=");
        a11.append(queue);
        a11.append(", infoContainerWidth=");
        c.e(a11, num, ", ugcContainerWidth=", num2, ", videoContainerWidth=");
        a11.append(num3);
        a11.append(", isBigStateInfo=");
        a11.append(z11);
        a11.append(", isVerticalStateUgc=");
        f.c(", isCreateOnBoarding=", ", buttonsTintRes=", a11, z12, z13);
        a11.append(num4);
        a11.append(", icons=");
        a11.append(list);
        a11.append(", hasWave=");
        f.c(", hasVideoContent=", ", hasDifferentContainers=", a11, z14, z15);
        return a.a(")", a11, z16);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GalleryV4PreCreationConfig(int r20, int r21, int r22, java.util.Queue r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.Integer r26, boolean r27, boolean r28, boolean r29, java.lang.Integer r30, java.util.List r31, boolean r32, boolean r33, boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r23
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r24
        L13:
            r1 = r0 & 32
            if (r1 == 0) goto L19
            r9 = r2
            goto L1b
        L19:
            r9 = r25
        L1b:
            r1 = r0 & 64
            if (r1 == 0) goto L21
            r10 = r2
            goto L23
        L21:
            r10 = r26
        L23:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r1 == 0) goto L2a
            r11 = r3
            goto L2c
        L2a:
            r11 = r27
        L2c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L32
            r12 = r3
            goto L34
        L32:
            r12 = r28
        L34:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r3 = 0
            if (r1 == 0) goto L3b
            r13 = r3
            goto L3d
        L3b:
            r13 = r29
        L3d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L43
            r14 = r2
            goto L45
        L43:
            r14 = r30
        L45:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L4b
            r15 = r2
            goto L4d
        L4b:
            r15 = r31
        L4d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L54
            r16 = r3
            goto L56
        L54:
            r16 = r32
        L56:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L5d
            r17 = r3
            goto L5f
        L5d:
            r17 = r33
        L5f:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L6e
            r18 = r3
            r4 = r20
            r5 = r21
            r6 = r22
            r3 = r19
            goto L78
        L6e:
            r18 = r34
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
        L78:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig.<init>(int, int, int, java.util.Queue, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean, java.lang.Integer, java.util.List, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
