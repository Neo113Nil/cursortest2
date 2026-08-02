package ru.ozon.android.messenger.framework.composer.action;

import Tg.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements b.c {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        ((d) obj).getClass();
        return true;
    }

    @Override // Tg.b
    public final String getId() {
        return null;
    }

    @Override // Tg.b.c
    public final String getLink() {
        return null;
    }

    @Override // Tg.b.c
    public final b.f getScrollTo() {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @NotNull
    public final String toString() {
        return "DismissAndRefresh(id=null, link=null, scrollTo=null)";
    }
}
