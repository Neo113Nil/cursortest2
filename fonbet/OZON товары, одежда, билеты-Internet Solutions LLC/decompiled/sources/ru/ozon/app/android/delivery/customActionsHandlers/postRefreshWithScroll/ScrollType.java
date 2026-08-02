package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import Xc.a;
import Xc.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/ScrollType;", "", "<init>", "(Ljava/lang/String;I)V", "ANCHOR_ELSE_VIEW_PORT", "VIEW_PORT", "TOP", "UNDEFINED", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ScrollType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ScrollType ANCHOR_ELSE_VIEW_PORT = new ScrollType("ANCHOR_ELSE_VIEW_PORT", 0);
    public static final ScrollType VIEW_PORT = new ScrollType("VIEW_PORT", 1);
    public static final ScrollType TOP = new ScrollType("TOP", 2);
    public static final ScrollType UNDEFINED = new ScrollType("UNDEFINED", 3);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/ScrollType$Companion;", "", "<init>", "()V", "mapToScrollType", "Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/ScrollType;", "", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScrollType mapToScrollType(String str) {
            Object obj;
            Iterator<E> it = ScrollType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((ScrollType) obj).name(), str)) {
                    break;
                }
            }
            ScrollType scrollType = (ScrollType) obj;
            return scrollType == null ? ScrollType.UNDEFINED : scrollType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ScrollType[] $values() {
        return new ScrollType[]{ANCHOR_ELSE_VIEW_PORT, VIEW_PORT, TOP, UNDEFINED};
    }

    static {
        ScrollType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private ScrollType(String str, int i11) {
    }

    @NotNull
    public static a<ScrollType> getEntries() {
        return $ENTRIES;
    }

    public static ScrollType valueOf(String str) {
        return (ScrollType) Enum.valueOf(ScrollType.class, str);
    }

    public static ScrollType[] values() {
        return (ScrollType[]) $VALUES.clone();
    }
}
