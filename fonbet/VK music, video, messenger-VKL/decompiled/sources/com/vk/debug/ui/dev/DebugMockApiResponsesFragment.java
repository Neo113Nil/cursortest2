package com.vk.debug.ui.dev;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.debug.design.MockType;
import com.vk.debug.internal.ApiResponseMocks;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b25;
import xsna.bzj;
import xsna.c5g;
import xsna.e6l;
import xsna.fh9;
import xsna.gzs;
import xsna.izs;
import xsna.jai;
import xsna.l5m;
import xsna.msy;
import xsna.mut0;
import xsna.o2l;
import xsna.oh3;
import xsna.oz50;
import xsna.r6l;
import xsna.rh90;
import xsna.s3q0;
import xsna.uu20;
import xsna.wzs;

/* compiled from: DebugMockApiResponsesFragment.kt */
/* loaded from: classes17.dex */
public final class DebugMockApiResponsesFragment extends FragmentImpl {
    public static final /* synthetic */ int O = 0;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new bzj(this, 1));

    /* compiled from: DebugMockApiResponsesFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DebugMockApiResponsesFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((DebugMockApiResponsesFragment) this.receiver).finish();
            return s3q0.a;
        }
    }

    /* compiled from: DebugMockApiResponsesFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((DebugMockApiResponsesFragment) this.receiver).finish();
            return s3q0.a;
        }
    }

    /* compiled from: DebugMockApiResponsesFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((o2l) this.receiver).getClass();
            o2l.h("mockApiResponsesEnabled", booleanValue);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MockType mockType;
        Context requireContext = requireContext();
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_MOCK_API.h(), null, "start", null, String.valueOf(((b25) this.N.getValue()).c().b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
        l5mVar.q();
        final b bVar = new b(0, this, DebugMockApiResponsesFragment.class, "finish", "finish()V", 0);
        ApiResponseMocks.a.getClass();
        List<ApiResponseMocks.Mock> a2 = ApiResponseMocks.a();
        final ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ApiResponseMocks.Mock mock : a2) {
            String str = mock.a;
            ApiResponseMocks.Mock.Type type = mock.b;
            int i = e6l.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                mockType = MockType.TEXT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mockType = MockType.FILE;
            }
            MockType mockType2 = mockType;
            String str2 = mock.c;
            String k = type == ApiResponseMocks.Mock.Type.FILE ? r6l.k(requireContext, Uri.parse(str2)) : "";
            ?? r4 = mock.d;
            ArrayList arrayList2 = new ArrayList(r4.size());
            for (Map.Entry entry : r4.entrySet()) {
                arrayList2.add(new rh90((String) entry.getKey(), (String) entry.getValue()));
            }
            arrayList.add(new uu20(str, mockType2, str2, k, arrayList2));
        }
        o2l o2lVar = o2l.a;
        o2lVar.getClass();
        final boolean b2 = o2l.b("mockApiResponsesEnabled", false);
        final oh3 oh3Var = new oh3(15, this, requireContext);
        final d dVar = new d(1, o2lVar, o2l.class, "setMockApiResponsesEnabled", "setMockApiResponsesEnabled(Z)V", 0);
        fh9 fh9Var = r6l.a;
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-943494747, new wzs() { // from class: xsna.f6l
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-943494747, intValue, -1, "com.vk.debug.design.createComposeView.<anonymous>.<anonymous> (DebugMockApiResponsesScreen.kt:63)");
                    }
                    final DebugMockApiResponsesFragment.b bVar2 = DebugMockApiResponsesFragment.b.this;
                    final ArrayList arrayList3 = arrayList;
                    final boolean z = b2;
                    final oh3 oh3Var2 = oh3Var;
                    final DebugMockApiResponsesFragment.d dVar2 = dVar;
                    rrv0.d(null, null, null, null, kai.c(-589228278, new wzs() { // from class: xsna.k6l
                        @Override // xsna.wzs
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-589228278, intValue2, -1, "com.vk.debug.design.createComposeView.<anonymous>.<anonymous>.<anonymous> (DebugMockApiResponsesScreen.kt:64)");
                                }
                                r6l.a(DebugMockApiResponsesFragment.b.this, arrayList3, z, oh3Var2, dVar2, null, aVar2, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 24576, 15);
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
}
