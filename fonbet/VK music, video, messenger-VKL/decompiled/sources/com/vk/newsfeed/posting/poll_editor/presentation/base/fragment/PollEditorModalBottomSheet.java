package com.vk.newsfeed.posting.poll_editor.presentation.base.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.ao50;
import xsna.cpo;
import xsna.dpb0;
import xsna.dw20;
import xsna.f4z;
import xsna.f550;
import xsna.fz5;
import xsna.hj60;
import xsna.hob0;
import xsna.km50;
import xsna.kmu0;
import xsna.kob0;
import xsna.m0q0;
import xsna.mk50;
import xsna.mob0;
import xsna.nw20;
import xsna.o25;
import xsna.pnb0;
import xsna.rnb0;
import xsna.s8;
import xsna.tl50;
import xsna.tob0;
import xsna.tzp0;
import xsna.uh40;
import xsna.v16;
import xsna.vk50;
import xsna.w8i;
import xsna.wpb0;
import xsna.wx40;
import xsna.xn50;
import xsna.xpb0;
import xsna.yfb;
import xsna.zcl;

/* compiled from: PollEditorModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class PollEditorModalBottomSheet extends tl50<hob0, wpb0, pnb0> implements w8i {
    public static final tzp0.c.a o1 = new tzp0.c.a(new b(), false);
    public mob0 k1;
    public View m1;
    public View n1;
    public final tob0 i1 = new tob0(this, this, new hj60(this, 7), new f550(this, 13));
    public final io.reactivex.rxjava3.disposables.b j1 = new io.reactivex.rxjava3.disposables.b();
    public final f4z l1 = new f4z();

    /* compiled from: PollEditorModalBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_POLL;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        mob0 mob0Var = new mob0(xpb0.b.a, new wx40(this, 2), this, requireContext());
        this.k1 = mob0Var;
        return new mk50.c(mob0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        wpb0 wpb0Var = (wpb0) ao50Var;
        mob0 mob0Var = this.k1;
        if (mob0Var == null) {
            mob0Var = null;
        }
        mob0Var.f(wpb0Var, new s8(1, this, PollEditorModalBottomSheet.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 13));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((hob0) vk50Var).f.a(new uh40(this, 11), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, new pnb0.c.h(false));
        return true;
    }

    public final ModalBottomSheetBehavior<?> bo() {
        View view = this.n1;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVar = fVar != null ? fVar.a : null;
        if (cVar instanceof ModalBottomSheetBehavior) {
            return (ModalBottomSheetBehavior) cVar;
        }
        return null;
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
        }
        xn50.a.c(this, rnb0.b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.j1.e();
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r13 == null) goto L13;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        PollEditorArguments pollEditorArguments;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("PollEditorArguments", PollEditorArguments.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("PollEditorArguments");
                if (!(parcelable3 instanceof PollEditorArguments)) {
                    parcelable3 = null;
                }
                parcelable = (PollEditorArguments) parcelable3;
            }
            pollEditorArguments = (PollEditorArguments) parcelable;
        }
        pollEditorArguments = new PollEditorArguments(o25.a().c(), new PollEditorUiConfig(0, 0, 0, 0, 0, 0, 0, 127, null), null, null, null, SystemClock.elapsedRealtime(), 28, null);
        return new hob0(new dpb0(new PollEditorState.Loading(pollEditorArguments.b, pollEditorArguments.c, new PickerTechMetrics(pollEditorArguments.g, null, null)), new fz5(), pollEditorArguments.c, pollEditorArguments.e, pollEditorArguments.f, !r13.k, pollEditorArguments.d.l), new pnb0.b(pollEditorArguments), this.l1);
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View findViewById;
        Dialog yn = super.yn(bundle);
        View findViewById2 = yn.findViewById(R.id.coordinator);
        this.m1 = findViewById2;
        this.n1 = findViewById2 != null ? findViewById2.findViewById(R.id.design_bottom_sheet) : null;
        View view = this.m1;
        if (view != null && (findViewById = view.findViewById(R.id.touch_outside)) != null) {
            findViewById.setOnClickListener(new v16(this, 7));
        }
        nw20 nw20Var = yn instanceof nw20 ? (nw20) yn : null;
        if (nw20Var != null) {
            nw20Var.Y = 15;
        }
        return yn;
    }

    /* compiled from: PollEditorModalBottomSheet.kt */
    public static final class PollEditorArguments implements Parcelable {
        public static final Parcelable.Creator<PollEditorArguments> CREATOR = new a();
        public final UserId b;
        public final PollEditorUiConfig c;
        public final PostingPollDto d;
        public final PostingPollDto e;
        public final PollEditorMode f;
        public final long g;

        /* compiled from: PollEditorModalBottomSheet.kt */
        public static final class a implements Parcelable.Creator<PollEditorArguments> {
            @Override // android.os.Parcelable.Creator
            public final PollEditorArguments createFromParcel(Parcel parcel) {
                UserId userId = (UserId) parcel.readParcelable(PollEditorArguments.class.getClassLoader());
                PollEditorUiConfig createFromParcel = PollEditorUiConfig.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<PostingPollDto> creator = PostingPollDto.CREATOR;
                return new PollEditorArguments(userId, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (PollEditorMode) parcel.readParcelable(PollEditorArguments.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final PollEditorArguments[] newArray(int i) {
                return new PollEditorArguments[i];
            }
        }

        public PollEditorArguments(UserId userId, PollEditorUiConfig pollEditorUiConfig, PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PollEditorMode pollEditorMode, long j) {
            this.b = userId;
            this.c = pollEditorUiConfig;
            this.d = postingPollDto;
            this.e = postingPollDto2;
            this.f = pollEditorMode;
            this.g = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            this.c.writeToParcel(parcel, i);
            this.d.writeToParcel(parcel, i);
            PostingPollDto postingPollDto = this.e;
            if (postingPollDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingPollDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.f, i);
            parcel.writeLong(this.g);
        }

        public /* synthetic */ PollEditorArguments(UserId userId, PollEditorUiConfig pollEditorUiConfig, PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PollEditorMode pollEditorMode, long j, int i, zcl zclVar) {
            this(userId, pollEditorUiConfig, (i & 4) != 0 ? new PostingPollDto(0, null, null, null, false, false, false, false, 0L, false, false, 2047, null) : postingPollDto, (i & 8) != 0 ? null : postingPollDto2, (i & 16) != 0 ? PollEditorMode.Create.b : pollEditorMode, j);
        }
    }

    /* compiled from: PollEditorModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final UserId h;
        public final PostingPollDto i;
        public final PostingPollDto j;
        public final PollEditorMode k;
        public final PollEditorUiConfig l;
        public final long m;
        public final kob0 n;

        public a(Context context, UserId userId, PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PollEditorMode pollEditorMode, PollEditorUiConfig pollEditorUiConfig, long j, kob0 kob0Var) {
            super(context, PollEditorModalBottomSheet.o1);
            this.h = userId;
            this.i = postingPollDto;
            this.j = postingPollDto2;
            this.k = pollEditorMode;
            this.l = pollEditorUiConfig;
            this.m = j;
            this.n = kob0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c(new cpo(false, 0, 7));
            F0(true);
            x(0);
            m(R.attr.vk_ui_background_modal);
            R0(false);
            I(false);
            p(true);
            O();
            PollEditorModalBottomSheet pollEditorModalBottomSheet = new PollEditorModalBottomSheet();
            n(new C1433a(pollEditorModalBottomSheet));
            pollEditorModalBottomSheet.setArguments(yfb.b(new Pair("PollEditorArguments", new PollEditorArguments(this.h, this.l, this.i, this.j, this.k, this.m))));
            pollEditorModalBottomSheet.i1.e = this.n;
            return pollEditorModalBottomSheet;
        }

        /* compiled from: PollEditorModalBottomSheet.kt */
        /* renamed from: com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet$a$a, reason: collision with other inner class name */
        public static final class C1433a extends ModalBottomSheetBehavior.d {
            public final /* synthetic */ PollEditorModalBottomSheet a;

            public C1433a(PollEditorModalBottomSheet pollEditorModalBottomSheet) {
                this.a = pollEditorModalBottomSheet;
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void b(int i, View view) {
                ModalBottomSheetBehavior<?> bo;
                PollEditorModalBottomSheet pollEditorModalBottomSheet = this.a;
                if (i == 5 || (i == 4 && (bo = pollEditorModalBottomSheet.bo()) != null && bo.j)) {
                    xn50.a.c(pollEditorModalBottomSheet, new pnb0.c.h(true));
                }
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void a(View view, float f) {
            }
        }
    }
}
