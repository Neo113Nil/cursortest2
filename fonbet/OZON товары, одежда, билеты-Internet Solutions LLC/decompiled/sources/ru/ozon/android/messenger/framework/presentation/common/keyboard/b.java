package ru.ozon.android.messenger.framework.presentation.common.keyboard;

import Sc.o;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.lifecycle.D;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import xe.C10727i;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f90769a;

        /* renamed from: b, reason: collision with root package name */
        private final D f90770b;

        public a(@NotNull View view, D d11) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f90769a = view;
            this.f90770b = d11;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.keyboard.b
        public final void a(@NotNull c state, @NotNull Function0 preShow, @NotNull Function0 preHide) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(preShow, "preShow");
            Intrinsics.checkNotNullParameter(preHide, "preHide");
            if (!Intrinsics.d(state, c.C1688b.f90772a)) {
                if (!Intrinsics.d(state, c.a.f90771a)) {
                    throw new o();
                }
                preHide.invoke();
                c(true);
                return;
            }
            preShow.invoke();
            D d11 = this.f90770b;
            if (d11 != null) {
                C10727i.c(d11, null, null, new ru.ozon.android.messenger.framework.presentation.common.keyboard.a(this, null), 3);
            }
        }

        public final void c(boolean z11) {
            View view = this.f90769a;
            if (z11) {
                view.clearFocus();
            }
            ViewExtKt.hideKeyboard(view);
        }

        @NotNull
        public final c d() {
            C5353y0 n11 = Y.n(this.f90769a);
            return n11 != null ? n11.p(8) : false ? c.C1688b.f90772a : c.a.f90771a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.keyboard.b$b, reason: collision with other inner class name */
    public static final class C1686b {
    }

    public static abstract class c implements Parcelable {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f90771a = new a(0);

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C1687a();

            /* renamed from: ru.ozon.android.messenger.framework.presentation.common.keyboard.b$c$a$a, reason: collision with other inner class name */
            public static final class C1687a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f90771a;
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

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.common.keyboard.b$c$b, reason: collision with other inner class name */
        public static final class C1688b extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1688b f90772a = new C1688b(0);

            @NotNull
            public static final Parcelable.Creator<C1688b> CREATOR = new a();

            /* renamed from: ru.ozon.android.messenger.framework.presentation.common.keyboard.b$c$b$a */
            public static final class a implements Parcelable.Creator<C1688b> {
                @Override // android.os.Parcelable.Creator
                public final C1688b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C1688b.f90772a;
                }

                @Override // android.os.Parcelable.Creator
                public final C1688b[] newArray(int i11) {
                    return new C1688b[i11];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ c(int i11) {
            this();
        }

        private c() {
        }
    }

    void a(@NotNull c cVar, @NotNull Function0 function0, @NotNull Function0 function02);
}
