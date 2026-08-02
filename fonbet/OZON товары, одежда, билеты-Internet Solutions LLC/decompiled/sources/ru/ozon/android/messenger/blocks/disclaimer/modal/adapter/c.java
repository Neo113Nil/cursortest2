package ru.ozon.android.messenger.blocks.disclaimer.modal.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public interface c extends Parcelable {

    public interface a extends c {

        /* renamed from: ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c$a$a, reason: collision with other inner class name */
        public static final class C1492a implements a {

            @NotNull
            public static final Parcelable.Creator<C1492a> CREATOR;

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final DisclosureIconTitleSubtitleCellDTO f85054a;

            /* renamed from: ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c$a$a$a, reason: collision with other inner class name */
            public static final class C1493a implements Parcelable.Creator<C1492a> {
                @Override // android.os.Parcelable.Creator
                public final C1492a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C1492a((DisclosureIconTitleSubtitleCellDTO) parcel.readParcelable(C1492a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final C1492a[] newArray(int i11) {
                    return new C1492a[i11];
                }
            }

            static {
                int i11 = DisclosureIconTitleSubtitleCellDTO.$stable;
                CREATOR = new C1493a();
            }

            public C1492a(@NotNull DisclosureIconTitleSubtitleCellDTO disclosure) {
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                this.f85054a = disclosure;
            }

            @Override // ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c.a
            @NotNull
            public final Map<String, MessengerTrackingInfo> I() {
                CommonCellSettings common = this.f85054a.getCommon();
                return h.a(common != null ? common.getTrackingInfo() : null);
            }

            @NotNull
            public final DisclosureIconTitleSubtitleCellDTO a() {
                return this.f85054a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1492a) && Intrinsics.d(this.f85054a, ((C1492a) obj).f85054a);
            }

            public final int hashCode() {
                return this.f85054a.hashCode();
            }

            @Override // ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c.a
            public final ru.ozon.android.messenger.framework.navigation.action.a r0() {
                AtomActionDTO action;
                CommonCellSettings common = this.f85054a.getCommon();
                if (common == null || (action = common.getAction()) == null) {
                    return null;
                }
                return ru.ozon.android.messenger.framework.navigation.action.b.c(action);
            }

            @NotNull
            public final String toString() {
                return "Disclosure(disclosure=" + this.f85054a + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f85054a, i11);
            }
        }

        Map<String, MessengerTrackingInfo> I();

        ru.ozon.android.messenger.framework.navigation.action.a r0();
    }

    public static final class b implements c {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextDTO f85055a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f85056b;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b((TextDTO) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(@NotNull TextDTO text, boolean z11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f85055a = text;
            this.f85056b = z11;
        }

        public final boolean a() {
            return this.f85056b;
        }

        @NotNull
        public final TextDTO b() {
            return this.f85055a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f85055a, bVar.f85055a) && this.f85056b == bVar.f85056b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85056b) + (this.f85055a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Description(text=" + this.f85055a + ", lastItemOfThisType=" + this.f85056b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85055a, i11);
            dest.writeInt(this.f85056b ? 1 : 0);
        }
    }
}
