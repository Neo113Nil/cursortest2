package ru.ozon.android.messenger.blocks.ai.header.presentation;

import T7.E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class a implements g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f84120a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84121b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C1458a> f84122c;

    /* renamed from: d, reason: collision with root package name */
    private final AiHeaderDTO.TitleSubtitle f84123d;

    /* renamed from: e, reason: collision with root package name */
    private final ButtonV3DTO f84124e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<C1458a> f84125f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final CornerRadius f84126g;

    /* renamed from: h, reason: collision with root package name */
    private final TestInfo f84127h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f84128i;

    /* renamed from: ru.ozon.android.messenger.blocks.ai.header.presentation.a$a, reason: collision with other inner class name */
    public static final class C1458a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C1458a> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        private final IconButtonV3DTO f84129a;

        /* renamed from: b, reason: collision with root package name */
        private final ButtonV3DTO f84130b;

        /* renamed from: ru.ozon.android.messenger.blocks.ai.header.presentation.a$a$a, reason: collision with other inner class name */
        public static final class C1459a implements Parcelable.Creator<C1458a> {
            @Override // android.os.Parcelable.Creator
            public final C1458a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C1458a((IconButtonV3DTO) parcel.readParcelable(C1458a.class.getClassLoader()), (ButtonV3DTO) parcel.readParcelable(C1458a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final C1458a[] newArray(int i11) {
                return new C1458a[i11];
            }
        }

        static {
            int i11 = IconButtonV3DTO.$stable;
            CREATOR = new C1459a();
        }

        public C1458a(IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO) {
            this.f84129a = iconButtonV3DTO;
            this.f84130b = buttonV3DTO;
        }

        public final IconButtonV3DTO a() {
            return this.f84129a;
        }

        public final ButtonV3DTO b() {
            return this.f84130b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1458a)) {
                return false;
            }
            C1458a c1458a = (C1458a) obj;
            return Intrinsics.d(this.f84129a, c1458a.f84129a) && Intrinsics.d(this.f84130b, c1458a.f84130b);
        }

        public final int hashCode() {
            IconButtonV3DTO iconButtonV3DTO = this.f84129a;
            int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
            ButtonV3DTO buttonV3DTO = this.f84130b;
            return hashCode + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ButtonItemVO(iconButton=" + this.f84129a + ", textButton=" + this.f84130b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84129a, i11);
            dest.writeParcelable(this.f84130b, i11);
        }
    }

    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c createFromParcel = c.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(C1458a.CREATOR, parcel, arrayList, i11, 1);
            }
            AiHeaderDTO.TitleSubtitle createFromParcel2 = parcel.readInt() == 0 ? null : AiHeaderDTO.TitleSubtitle.CREATOR.createFromParcel(parcel);
            ButtonV3DTO buttonV3DTO = (ButtonV3DTO) parcel.readParcelable(a.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i12 = 0;
            while (i12 != readInt2) {
                i12 = Ak.b.b(C1458a.CREATOR, parcel, arrayList2, i12, 1);
            }
            CornerRadius valueOf = CornerRadius.valueOf(parcel.readString());
            TestInfo testInfo = (TestInfo) parcel.readParcelable(a.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt3);
                for (int i13 = 0; i13 != readInt3; i13++) {
                    linkedHashMap.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new a(createFromParcel, readString, arrayList, createFromParcel2, buttonV3DTO, arrayList2, valueOf, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(@NotNull c blockId, String str, @NotNull List<C1458a> leadingButtons, AiHeaderDTO.TitleSubtitle titleSubtitle, ButtonV3DTO buttonV3DTO, @NotNull List<C1458a> trailingButtons, @NotNull CornerRadius cornerRadius, TestInfo testInfo, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(leadingButtons, "leadingButtons");
        Intrinsics.checkNotNullParameter(trailingButtons, "trailingButtons");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.f84120a = blockId;
        this.f84121b = str;
        this.f84122c = leadingButtons;
        this.f84123d = titleSubtitle;
        this.f84124e = buttonV3DTO;
        this.f84125f = trailingButtons;
        this.f84126g = cornerRadius;
        this.f84127h = testInfo;
        this.f84128i = map;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static void a(a aVar, c blockId, AiHeaderDTO.TitleSubtitle titleSubtitle, ButtonV3DTO buttonV3DTO, int i11) {
        if ((i11 & 16) != 0) {
            buttonV3DTO = aVar.f84124e;
        }
        ?? r92 = aVar.f84128i;
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        List<C1458a> leadingButtons = aVar.f84122c;
        Intrinsics.checkNotNullParameter(leadingButtons, "leadingButtons");
        List<C1458a> trailingButtons = aVar.f84125f;
        Intrinsics.checkNotNullParameter(trailingButtons, "trailingButtons");
        CornerRadius cornerRadius = aVar.f84126g;
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        new a(blockId, aVar.f84121b, leadingButtons, titleSubtitle, buttonV3DTO, trailingButtons, cornerRadius, aVar.f84127h, r92);
    }

    public final ButtonV3DTO b() {
        return this.f84124e;
    }

    @NotNull
    public final CornerRadius c() {
        return this.f84126g;
    }

    @NotNull
    public final List<C1458a> d() {
        return this.f84122c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TestInfo e() {
        return this.f84127h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84120a, aVar.f84120a) && Intrinsics.d(this.f84121b, aVar.f84121b) && Intrinsics.d(this.f84122c, aVar.f84122c) && Intrinsics.d(this.f84123d, aVar.f84123d) && Intrinsics.d(this.f84124e, aVar.f84124e) && Intrinsics.d(this.f84125f, aVar.f84125f) && this.f84126g == aVar.f84126g && Intrinsics.d(this.f84127h, aVar.f84127h) && Intrinsics.d(this.f84128i, aVar.f84128i);
    }

    public final AiHeaderDTO.TitleSubtitle f() {
        return this.f84123d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo>] */
    public final Map<String, MessengerTrackingInfo> g() {
        return this.f84128i;
    }

    public final String getBackgroundColor() {
        return this.f84121b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final c getBlockId() {
        return this.f84120a;
    }

    @NotNull
    public final List<C1458a> h() {
        return this.f84125f;
    }

    public final int hashCode() {
        int hashCode = this.f84120a.hashCode() * 31;
        String str = this.f84121b;
        int b11 = G.g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f84122c);
        AiHeaderDTO.TitleSubtitle titleSubtitle = this.f84123d;
        int hashCode2 = (b11 + (titleSubtitle == null ? 0 : titleSubtitle.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.f84124e;
        int b12 = Tl.b.b(this.f84126g, G.g.b((hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, this.f84125f), 31);
        TestInfo testInfo = this.f84127h;
        int hashCode3 = (b12 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Object obj = this.f84128i;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiHeaderVO(blockId=");
        sb2.append(this.f84120a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f84121b);
        sb2.append(", leadingButtons=");
        sb2.append(this.f84122c);
        sb2.append(", titleSubtitle=");
        sb2.append(this.f84123d);
        sb2.append(", actionButton=");
        sb2.append(this.f84124e);
        sb2.append(", trailingButtons=");
        sb2.append(this.f84125f);
        sb2.append(", cornerRadius=");
        sb2.append(this.f84126g);
        sb2.append(", testInfo=");
        sb2.append(this.f84127h);
        sb2.append(", trackingInfo=");
        return E.c(this.f84128i, ")", sb2);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84120a.writeToParcel(dest, i11);
        dest.writeString(this.f84121b);
        Iterator c11 = Bi.a.c(this.f84122c, dest);
        while (c11.hasNext()) {
            ((C1458a) c11.next()).writeToParcel(dest, i11);
        }
        AiHeaderDTO.TitleSubtitle titleSubtitle = this.f84123d;
        if (titleSubtitle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            titleSubtitle.writeToParcel(dest, i11);
        }
        dest.writeParcelable(this.f84124e, i11);
        Iterator c12 = Bi.a.c(this.f84125f, dest);
        while (c12.hasNext()) {
            ((C1458a) c12.next()).writeToParcel(dest, i11);
        }
        dest.writeString(this.f84126g.name());
        dest.writeParcelable(this.f84127h, i11);
        ?? r22 = this.f84128i;
        if (r22 == 0) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(r22.size());
        for (Map.Entry entry : r22.entrySet()) {
            dest.writeString((String) entry.getKey());
            ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, i11);
        }
    }
}
