package com.vk.clips.entrypoints.di;

import com.vk.clips.entrypoints.stub.ClipsEntryPointsComponentStub;
import com.vk.di.component.DiUnscopedComponent;
import xsna.nud;
import xsna.p1e;

/* compiled from: ClipsEntryPointsComponent.kt */
/* loaded from: classes16.dex */
public interface ClipsEntryPointsComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: ClipsEntryPointsComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsEntryPointsComponentStub STUB = new ClipsEntryPointsComponentStub();

        public final ClipsEntryPointsComponentStub getSTUB() {
            return STUB;
        }
    }

    nud E6();

    p1e e();
}
