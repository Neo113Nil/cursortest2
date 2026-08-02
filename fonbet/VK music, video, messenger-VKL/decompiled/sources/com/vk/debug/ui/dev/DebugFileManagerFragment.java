package com.vk.debug.ui.dev;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e5l;
import xsna.gzs;
import xsna.j20;
import xsna.jai;
import xsna.mmf;
import xsna.mut0;
import xsna.o1e;
import xsna.oz50;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: DebugFileManagerFragment.kt */
/* loaded from: classes17.dex */
public final class DebugFileManagerFragment extends FragmentImpl {
    public static final /* synthetic */ int R = 0;
    public final io.reactivex.rxjava3.disposables.b N = new io.reactivex.rxjava3.disposables.b();
    public final AtomicInteger O = new AtomicInteger(0);
    public gzs<s3q0> P;
    public boolean Q;

    /* compiled from: DebugFileManagerFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DebugFileManagerFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((DebugFileManagerFragment) this.receiver).finish();
            return s3q0.a;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (this.Q) {
            return false;
        }
        gzs<s3q0> gzsVar = this.P;
        if (gzsVar == null) {
            return true;
        }
        gzsVar.invoke();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        final String absolutePath = requireContext.getFilesDir().getAbsolutePath();
        final String absolutePath2 = requireContext.getDataDir().getAbsolutePath();
        final b bVar = new b(0, this, DebugFileManagerFragment.class, "finish", "finish()V", 0);
        final j20 j20Var = new j20(12, this, requireContext);
        final e5l e5lVar = new e5l(0, this, absolutePath);
        final mmf mmfVar = new mmf(this, 16);
        final o1e o1eVar = new o1e(this, 11);
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-1907825978, new wzs() { // from class: xsna.j5l
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1907825978, intValue, -1, "com.vk.debug.design.createFileManagerComposeView.<anonymous>.<anonymous> (DebugFileManagerScreen.kt:69)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1937702465, new k5l(absolutePath, absolutePath2, bVar, j20Var, e5lVar, mmfVar, o1eVar), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.N.dispose();
    }
}
