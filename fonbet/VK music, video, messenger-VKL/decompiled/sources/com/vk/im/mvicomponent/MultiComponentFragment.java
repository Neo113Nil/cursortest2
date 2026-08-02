package com.vk.im.mvicomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kj50;
import xsna.kpj0;
import xsna.mg8;
import xsna.wzs;
import xsna.yj50;
import xsna.yn50;

/* compiled from: MultiComponentFragment.kt */
/* loaded from: classes.dex */
public abstract class MultiComponentFragment extends MviComponentFragment {
    public final int T;

    /* compiled from: MultiComponentFragment.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<yj50<?, ?, ?, ?, ?, ?, ?>, yn50, List<? extends kj50>> {
        public a(MultiComponentFragment multiComponentFragment) {
            super(2, multiComponentFragment, MultiComponentFragment.class, "broadcastEvent", "broadcastEvent(Lcom/vk/im/mvicomponent/MviComponent;Lcom/vk/im/mvicomponent/MviViewEvent;)Ljava/util/List;", 0);
        }

        @Override // xsna.wzs
        public final List<? extends kj50> invoke(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, yn50 yn50Var) {
            return ((MultiComponentFragment) this.receiver).ko(yn50Var);
        }
    }

    /* compiled from: MultiComponentFragment.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<yj50<?, ?, ?, ?, ?, ?, ?>, kj50, List<? extends kj50>> {
        public b(MultiComponentFragment multiComponentFragment) {
            super(2, multiComponentFragment, MultiComponentFragment.class, "broadcastAction", "broadcastAction(Lcom/vk/im/mvicomponent/MviComponent;Lcom/vk/mvi/core/data/MviAction;)Ljava/util/List;", 0);
        }

        @Override // xsna.wzs
        public final List<? extends kj50> invoke(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, kj50 kj50Var) {
            return ((MultiComponentFragment) this.receiver).jo(kj50Var);
        }
    }

    public MultiComponentFragment(int i) {
        this.T = i;
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final mg8 eo() {
        return new kpj0(new a(this), new b(this));
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public ViewGroup go(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(this.T, viewGroup, false);
    }

    public List jo(kj50 kj50Var) {
        return EmptyList.b;
    }

    public EmptyList ko(yn50 yn50Var) {
        return EmptyList.b;
    }
}
