package com.vk.report.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.n5g0;

/* compiled from: ReportComponent.kt */
/* loaded from: classes5.dex */
public interface ReportComponent extends DiUnscopedComponent {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: ReportComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ReportComponent STUB = new ReportComponent() { // from class: com.vk.report.api.di.ReportComponent$Companion$STUB$1
            public final n5g0 a = n5g0.a.getSTUB();

            @Override // com.vk.report.api.di.ReportComponent
            public final n5g0 d4() {
                return this.a;
            }
        };

        public final ReportComponent getSTUB() {
            return STUB;
        }
    }

    n5g0 d4();
}
