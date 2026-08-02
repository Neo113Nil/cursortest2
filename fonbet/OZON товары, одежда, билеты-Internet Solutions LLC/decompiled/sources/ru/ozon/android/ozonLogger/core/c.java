package ru.ozon.android.ozonLogger.core;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALERT;
    public static final c CRITICAL;

    @NotNull
    public static final a Companion;
    public static final c DEBUG;
    public static final c ERROR;
    public static final c INFO;
    public static final c NOTICE;
    public static final c WARNING;

    @NotNull
    private final String fullLabel = name();
    private final int intLevel;

    @NotNull
    private final String shortLabel;

    public static final class a {
        @NotNull
        public static c a(int i11) {
            Object obj;
            Iterator<E> it = c.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((c) obj).b() == i11) {
                    break;
                }
            }
            c cVar = (c) obj;
            if (cVar != null) {
                return cVar;
            }
            Xc.a<c> a11 = c.a();
            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
            Iterator<E> it2 = a11.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((c) it2.next()).b()));
            }
            throw new IllegalArgumentException(("intLevel == " + i11 + ", must be in " + arrayList).toString());
        }
    }

    static {
        c cVar = new c("ALERT", 0, 1, "A");
        ALERT = cVar;
        c cVar2 = new c("CRITICAL", 1, 2, "C");
        CRITICAL = cVar2;
        c cVar3 = new c("ERROR", 2, 3, "E");
        ERROR = cVar3;
        c cVar4 = new c("WARNING", 3, 4, "W");
        WARNING = cVar4;
        c cVar5 = new c("NOTICE", 4, 5, "N");
        NOTICE = cVar5;
        c cVar6 = new c("INFO", 5, 6, "I");
        INFO = cVar6;
        c cVar7 = new c("DEBUG", 6, 7, "D");
        DEBUG = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
        Companion = new a();
    }

    private c(String str, int i11, int i12, String str2) {
        this.intLevel = i12;
        this.shortLabel = str2;
    }

    @NotNull
    public static Xc.a<c> a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int b() {
        return this.intLevel;
    }

    @NotNull
    public final String d() {
        return this.shortLabel;
    }
}
