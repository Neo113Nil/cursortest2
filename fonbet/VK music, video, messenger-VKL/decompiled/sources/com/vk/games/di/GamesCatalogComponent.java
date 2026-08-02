package com.vk.games.di;

import com.vk.di.component.DiScopedComponent;
import xsna.kdt;
import xsna.lbt;
import xsna.pwj0;
import xsna.qct;

/* compiled from: GamesCatalogComponent.kt */
/* loaded from: classes.dex */
public interface GamesCatalogComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: GamesCatalogComponent.kt */
    /* loaded from: classes17.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final GamesCatalogComponent STUB = new GamesCatalogComponent() { // from class: com.vk.games.di.GamesCatalogComponent$Companion$STUB$1
            @Override // com.vk.games.di.GamesCatalogComponent
            public final qct E() {
                return qct.a.a.getSTUB();
            }

            @Override // com.vk.games.di.GamesCatalogComponent
            public final lbt V9() {
                return lbt.a.a.getSTUB();
            }

            @Override // com.vk.games.di.GamesCatalogComponent
            public final kdt c() {
                return kdt.a.a.getSTUB();
            }
        };

        public final GamesCatalogComponent getSTUB() {
            return STUB;
        }
    }

    qct E();

    lbt V9();

    kdt c();
}
