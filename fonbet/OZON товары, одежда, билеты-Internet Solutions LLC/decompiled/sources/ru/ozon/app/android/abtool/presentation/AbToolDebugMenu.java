package ru.ozon.app.android.abtool.presentation;

import Ld0.c;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s20.b;
import s20.d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/abtool/presentation/AbToolDebugMenu;", "Ls20/b;", "LLd0/c;", "diStore", "<init>", "(LLd0/c;)V", "Ls20/d;", "provide", "()Ls20/d;", "LLd0/c;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolDebugMenu extends b {

    @NotNull
    private final c diStore;

    public AbToolDebugMenu(@NotNull c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.diStore = diStore;
    }

    @Override // s20.b
    @NotNull
    public d provide() {
        return new d.a(this) { // from class: ru.ozon.app.android.abtool.presentation.AbToolDebugMenu$provide$1
            private final Function1<s20.c, Intent> intent;
            private final String id = "AB_TOOL_SDK_DEBUG_MENU_ID";
            private final String name = "ABTool";

            {
                this.intent = new AbToolDebugMenu$provide$1$intent$1(this);
            }

            @Override // s20.d.a
            public String getId() {
                return this.id;
            }

            @Override // s20.d.a
            public Function1<s20.c, Intent> getIntent() {
                return this.intent;
            }

            @Override // s20.d.a
            public String getName() {
                return this.name;
            }
        };
    }
}
