package com.vk.clips.coauthors.di;

import com.vk.clips.coauthors.di.stub.ClipsCoauthorsComponentStub;
import com.vk.di.component.DiUnscopedComponent;
import xsna.hmd;
import xsna.jmd;
import xsna.jnd;

/* compiled from: ClipsCoauthorsComponent.kt */
/* loaded from: classes16.dex */
public interface ClipsCoauthorsComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: ClipsCoauthorsComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsCoauthorsComponentStub STUB = new ClipsCoauthorsComponentStub();

        public final ClipsCoauthorsComponentStub getSTUB() {
            return STUB;
        }
    }

    jnd Fc();

    hmd b();

    jmd e();
}
