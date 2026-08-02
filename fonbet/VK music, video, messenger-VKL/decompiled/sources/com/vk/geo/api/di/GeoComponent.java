package com.vk.geo.api.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.geo.api.stub.GeoComponentStub;
import xsna.hyk0;
import xsna.tkt;

/* compiled from: GeoComponent.kt */
/* loaded from: classes18.dex */
public interface GeoComponent extends DiUnscopedComponent {
    public static final /* synthetic */ a Companion = a.a;

    /* compiled from: GeoComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final GeoComponent STUB = new GeoComponentStub();

        public final GeoComponent getSTUB() {
            return STUB;
        }
    }

    hyk0 ee();

    tkt s7();
}
