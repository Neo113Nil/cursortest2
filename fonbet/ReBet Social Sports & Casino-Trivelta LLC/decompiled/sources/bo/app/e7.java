package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e7 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25427a;

    public e7(String str) {
        this.f25427a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to create valid enum from string: " + this.f25427a;
    }
}
