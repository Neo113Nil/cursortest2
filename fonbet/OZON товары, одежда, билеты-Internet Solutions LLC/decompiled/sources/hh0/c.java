package hh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Exception f65526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Exception exc) {
        super(0);
        this.f65526b = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "handleRemoteMessage failed with " + this.f65526b;
    }
}
