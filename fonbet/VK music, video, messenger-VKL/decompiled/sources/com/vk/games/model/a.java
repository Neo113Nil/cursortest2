package com.vk.games.model;

import com.vk.games.model.GamesCatalogSection;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.epx;

/* compiled from: GamesCatalogDetailSection.kt */
/* loaded from: classes17.dex */
public abstract class a {

    /* compiled from: GamesCatalogDetailSection.kt */
    /* renamed from: com.vk.games.model.a$a, reason: collision with other inner class name */
    public static final class C1079a extends a {
        public final GamesCatalogSection.a.C1078a a;

        public C1079a(GamesCatalogSection.a.C1078a c1078a) {
            this.a = c1078a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1079a) && epx.f(this.a, ((C1079a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ActivitySection(activity=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogDetailSection.kt */
    public static final class b extends a {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("DetailSection(apps="), this.a);
        }
    }

    /* compiled from: GamesCatalogDetailSection.kt */
    public static final class c extends a {
        public final GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo a;

        public c(GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo gamesNotificationInfo) {
            this.a = gamesNotificationInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotificationSection(notification=" + this.a + ')';
        }
    }

    /* compiled from: GamesCatalogDetailSection.kt */
    public static final class d extends a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1608870114;
        }

        public final String toString() {
            return "Stub";
        }
    }

    /* compiled from: GamesCatalogDetailSection.kt */
    public static final class e extends a {
        public final GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo a;

        public e(GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo gamesNotificationInfo) {
            this.a = gamesNotificationInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UnreadNotificationSection(notification=" + this.a + ')';
        }
    }
}
