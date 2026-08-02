package com.vk.multiplecoownership.di;

import android.content.Context;
import com.vk.multiplecoownership.model.MultipleCoownershipModel;
import xsna.t740;

/* compiled from: MultipleCoownershipComponentStub.kt */
/* loaded from: classes3.dex */
public final class MultipleCoownershipComponentStub implements MultipleCoownershipComponent {

    /* compiled from: MultipleCoownershipComponentStub.kt */
    public static final class a implements t740 {
        @Override // xsna.t740
        public final boolean a(Context context, MultipleCoownershipModel multipleCoownershipModel) {
            return false;
        }
    }

    @Override // com.vk.multiplecoownership.di.MultipleCoownershipComponent
    public final t740 a() {
        return new a();
    }
}
