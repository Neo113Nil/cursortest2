package ib;

import bb.AbstractC5615b;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7038a extends AbstractC5615b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f66209b;

    /* renamed from: ib.a$a, reason: collision with other inner class name */
    public static final class C1088a {
        public static C7038a a(String clickAction) {
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            return new C7038a(clickAction);
        }
    }

    public C7038a(String str) {
        super("ClickSDKNotificationEvent");
        this.f66209b = str;
    }

    @Override // bb.AbstractC5615b
    @NotNull
    public final Map<String, String> b() {
        return U.j(new Pair("click_action", this.f66209b), new Pair("slot_id", String.valueOf(0L)), new Pair("banner_id", ""));
    }
}
