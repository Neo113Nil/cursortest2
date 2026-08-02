package com.vk.catalog2.common.ui.mvp.holder.group.topbar;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asu0;
import xsna.b6l;
import xsna.jai;
import xsna.jgz;
import xsna.r9;
import xsna.s3q0;
import xsna.spj;
import xsna.tho0;
import xsna.wd8;
import xsna.wh50;
import xsna.wn;
import xsna.wzs;
import xsna.yd4;
import xsna.yvj;
import xsna.zak0;

/* compiled from: CommunitiesSearchTopBarVh.kt */
/* loaded from: classes16.dex */
public final class CommunitiesSearchTopBarVh implements CatalogViewHolder {
    public final wd8 b;
    public final boolean c;
    public ComposeView d;
    public c e;
    public final d<String> f = d.O0("");
    public final wh50 g = k.b(new tho0("", 0, 6));
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;

    /* compiled from: CommunitiesSearchTopBarVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunitiesTopBarSearchState.values().length];
            try {
                iArr[CommunitiesTopBarSearchState.AlwaysExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunitiesTopBarSearchState.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunitiesTopBarSearchState.Collapsed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunitiesSearchTopBarVh.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh$bindData$1$1$2$1", f = "CommunitiesSearchTopBarVh.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: CommunitiesSearchTopBarVh.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CommunitiesTopBarSearchState.values().length];
                try {
                    iArr[CommunitiesTopBarSearchState.Expanded.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CommunitiesTopBarSearchState.Collapsed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CommunitiesSearchTopBarVh.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            int i = a.$EnumSwitchMapping$0[((CommunitiesTopBarSearchState) ((zak0) CommunitiesSearchTopBarVh.this.m).getValue()).ordinal()];
            if (i == 1) {
                ((zak0) CommunitiesSearchTopBarVh.this.h).setValue(Boolean.TRUE);
            } else if (i == 2) {
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = CommunitiesSearchTopBarVh.this;
                ((zak0) communitiesSearchTopBarVh.g).setValue(new tho0("", 0L, 6));
                CommunitiesSearchTopBarVh.this.f.onNext("");
            }
            return s3q0.a;
        }
    }

    public CommunitiesSearchTopBarVh(wd8 wd8Var, boolean z) {
        this.b = wd8Var;
        this.c = z;
        Boolean bool = Boolean.FALSE;
        this.h = k.b(bool);
        this.i = k.b(bool);
        this.j = k.b(bool);
        this.k = k.b(bool);
        this.l = k.b(null);
        this.m = k.b(CommunitiesTopBarSearchState.AlwaysExpanded);
        this.n = k.b(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ComposeView composeView = this.d;
        if (composeView == null) {
            composeView = null;
        }
        composeView.setContent(new jai(480520440, new yd4(this, 1), true));
    }

    public final void a() {
        ComposeView composeView = this.d;
        if (composeView == null) {
            composeView = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) composeView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            ComposeView composeView2 = this.d;
            inputMethodManager.hideSoftInputFromWindow((composeView2 != null ? composeView2 : null).getWindowToken(), 0);
        }
    }

    public final void b(String str) {
        int length = str.length();
        ((zak0) this.g).setValue(new tho0(str, jgz.c(length, length), 4));
        ((zak0) this.h).setValue(Boolean.FALSE);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        AppBarLayout.d dVar = new AppBarLayout.d(-2);
        dVar.a = 21;
        composeView.setLayoutParams(dVar);
        this.d = composeView;
        c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0.a.getClass();
        this.e = new y(this.f.z(500L, timeUnit, asu0.i()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wn(new r9(this, 25), 17));
        return composeView;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
