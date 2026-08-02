package uZ;

import EZ.g;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import qZ.InterfaceC9014f;
import sZ.AbstractC9643a;
import sZ.AbstractC9644b;

/* renamed from: uZ.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9992d extends AbstractC9643a<DialogInterfaceOnCancelListenerC5390k> {

    @NotNull
    private final sZ.c<DialogInterfaceOnCancelListenerC5390k> fragmentDestination;

    @NotNull
    private final b navigationMode;

    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> navigator;

    /* renamed from: uZ.d$a */
    public static final class a extends AbstractC9644b<C9992d> {
        @Override // sZ.AbstractC9644b
        public final void navigateFragment(@NotNull g navigator, @NotNull EZ.e<C9992d> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            G fragmentManager = navigator.getFragmentManager();
            sZ.c<DialogInterfaceOnCancelListenerC5390k> fragmentDestination = response.b().getFragmentDestination();
            DialogInterfaceOnCancelListenerC5390k fragment = fragmentDestination.getFragment();
            Integer requestCode = fragmentDestination.getRequestCode();
            if (requestCode != null) {
                i11 = requestCode.intValue();
            }
            if (i11 != 0) {
                fragment.setTargetFragment(fragmentManager.w0(), i11);
            }
            fragment.showNow(fragmentManager, fragmentDestination.getTag());
        }
    }

    /* renamed from: uZ.d$b */
    public static abstract class b implements Parcelable {

        /* renamed from: uZ.d$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f100436a = new a(0);

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C2201a();

            /* renamed from: uZ.d$b$a$a, reason: collision with other inner class name */
            public static final class C2201a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f100436a;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 997741800;
            }

            @NotNull
            public final String toString() {
                return "Dismiss";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* renamed from: uZ.d$b$b, reason: collision with other inner class name */
        public static final class C2202b extends b {

            @NotNull
            public static final Parcelable.Creator<C2202b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final InterfaceC9014f f100437a;

            /* renamed from: uZ.d$b$b$a */
            public static final class a implements Parcelable.Creator<C2202b> {
                @Override // android.os.Parcelable.Creator
                public final C2202b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C2202b((InterfaceC9014f) parcel.readParcelable(C2202b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final C2202b[] newArray(int i11) {
                    return new C2202b[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2202b(@NotNull InterfaceC9014f flowTag) {
                super(0);
                Intrinsics.checkNotNullParameter(flowTag, "flowTag");
                this.f100437a = flowTag;
            }

            @NotNull
            public final InterfaceC9014f a() {
                return this.f100437a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f100437a, i11);
            }
        }

        /* renamed from: uZ.d$b$c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f100438a = new c(0);

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: uZ.d$b$c$a */
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return c.f100438a;
                }

                @Override // android.os.Parcelable.Creator
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2037503463;
            }

            @NotNull
            public final String toString() {
                return "Keep";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* renamed from: uZ.d$b$d, reason: collision with other inner class name */
        public static final class C2203d extends b {

            @NotNull
            public static final Parcelable.Creator<C2203d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f100439a;

            /* renamed from: uZ.d$b$d$a */
            public static final class a implements Parcelable.Creator<C2203d> {
                @Override // android.os.Parcelable.Creator
                public final C2203d createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C2203d(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final C2203d[] newArray(int i11) {
                    return new C2203d[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2203d(@NotNull String context) {
                super(0);
                Intrinsics.checkNotNullParameter(context, "context");
                this.f100439a = context;
            }

            @NotNull
            public final String a() {
                return this.f100439a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f100439a);
            }
        }

        public /* synthetic */ b(int i11) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ C9992d(sZ.c cVar, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i11 & 2) != 0 ? b.a.f100436a : bVar);
    }

    @NotNull
    public DialogInterfaceOnCancelListenerC5390k getFragment() {
        return this.fragmentDestination.getFragment();
    }

    @NotNull
    public final sZ.c<DialogInterfaceOnCancelListenerC5390k> getFragmentDestination() {
        return this.fragmentDestination;
    }

    @NotNull
    public final b getNavigationMode() {
        return this.navigationMode;
    }

    @Override // pZ.f
    @NotNull
    public kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.navigator;
    }

    @NotNull
    public String toString() {
        return "DialogFragmentDestination(fragmentDestination=" + this.fragmentDestination + ", navigationMode=" + this.navigationMode + ")";
    }

    public C9992d(@NotNull sZ.c<DialogInterfaceOnCancelListenerC5390k> fragmentDestination, @NotNull b navigationMode) {
        Intrinsics.checkNotNullParameter(fragmentDestination, "fragmentDestination");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        this.fragmentDestination = fragmentDestination;
        this.navigationMode = navigationMode;
        this.navigator = N.b(a.class);
    }
}
