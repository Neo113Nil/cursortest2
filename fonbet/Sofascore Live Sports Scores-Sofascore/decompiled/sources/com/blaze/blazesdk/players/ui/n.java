package com.blaze.blazesdk.players.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import defpackage.a99;
import defpackage.duf;
import defpackage.fc6;
import defpackage.grm;
import defpackage.h79;
import defpackage.joa;
import defpackage.jy3;
import defpackage.km5;
import defpackage.ly3;
import defpackage.otk;
import defpackage.qtk;
import defpackage.tc3;
import defpackage.tkm;
import defpackage.ttk;
import defpackage.un0;
import defpackage.xka;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zcm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/blaze/blazesdk/players/ui/n;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "a", "b", "", "Lacm;", "langCCItems", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n extends DialogFragment {
    public static final b r = new b(null);
    public final otk q;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0021a();
        public final List a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.blaze.blazesdk.players.ui.n$a$a, reason: collision with other inner class name */
        public static final class C0021a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(a.class.getClassLoader()));
                }
                return new a(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public a(@NotNull List<? extends com.blaze.blazesdk.closed_captions.models.ui.e> list) {
            list.getClass();
            this.a = list;
        }

        public static a copy$default(a aVar, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.a;
            }
            aVar.getClass();
            list.getClass();
            return new a(list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return fc6.p(new StringBuilder("ClosedCaptionsBottomSheetFragmentArgs(availableLanguages="), this.a, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            List list = this.a;
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends xka implements Function0 {
        public final /* synthetic */ Fragment i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.i = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d extends xka implements Function0 {
        public final /* synthetic */ Function0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (ttk) this.i.invoke();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class e extends xka implements Function0 {
        public final /* synthetic */ joa i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(joa joaVar) {
            super(0);
            this.i = joaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ttk) this.i.getValue()).getViewModelStore();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class f extends xka implements Function0 {
        public final /* synthetic */ Function0 i;
        public final /* synthetic */ joa j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, joa joaVar) {
            super(0);
            this.i = function0;
            this.j = joaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ly3 ly3Var;
            Function0 function0 = this.i;
            if (function0 != null && (ly3Var = (ly3) function0.invoke()) != null) {
                return ly3Var;
            }
            ttk ttkVar = (ttk) this.j.getValue();
            h79 h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
            return h79Var != null ? h79Var.getDefaultViewModelCreationExtras() : jy3.b;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class g extends xka implements Function0 {
        public final /* synthetic */ Fragment i;
        public final /* synthetic */ joa j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, joa joaVar) {
            super(0);
            this.i = fragment;
            this.j = joaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            qtk defaultViewModelProviderFactory;
            ttk ttkVar = (ttk) this.j.getValue();
            h79 h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
            if (h79Var != null && (defaultViewModelProviderFactory = h79Var.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            qtk defaultViewModelProviderFactory2 = this.i.getDefaultViewModelProviderFactory();
            defaultViewModelProviderFactory2.getClass();
            return defaultViewModelProviderFactory2;
        }
    }

    public n() {
        joa a2 = ypa.a(ysa.c, new d(new c(this)));
        this.q = new otk(duf.a.getOrCreateKotlinClass(tkm.class), new e(a2), new g(this, a2), new f(null, a2));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Dialog l = super.l(bundle);
        Window window = l.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        return l;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar;
        List list;
        Parcelable parcelable;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT > 33) {
                parcelable = (Parcelable) arguments.getParcelable("available_languages", a.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("available_languages");
                if (!(parcelable2 instanceof a)) {
                    parcelable2 = null;
                }
                parcelable = (a) parcelable2;
            }
            aVar = (a) parcelable;
        } else {
            aVar = null;
        }
        if (aVar == null || (list = aVar.a) == null) {
            list = km5.a;
        }
        tkm tkmVar = (tkm) this.q.getValue();
        list.getClass();
        xw3.L(un0.z(tkmVar), null, null, new zcm(list, tkmVar, null), 3);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-1280516827, new grm(this), true));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        s parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("dismissEvent", true);
        Unit unit = Unit.a;
        parentFragmentManager.h0(bundle, "ClosedCaptionBottomSheetRequestKey");
    }
}
