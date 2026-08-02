package com.vk.importcontacts.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.oqw;

/* compiled from: ImportContactsComponent.kt */
/* loaded from: classes2.dex */
public interface ImportContactsComponent extends DiUnscopedComponent {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: ImportContactsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImportContactsComponent STUB = new ImportContactsComponent() { // from class: com.vk.importcontacts.api.di.ImportContactsComponent$Companion$STUB$1
            public final oqw a = oqw.a.a.getSTUB();

            @Override // com.vk.importcontacts.api.di.ImportContactsComponent
            public final oqw a() {
                return this.a;
            }
        };

        public final ImportContactsComponent getSTUB() {
            return STUB;
        }
    }

    oqw a();
}
