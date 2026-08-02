package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClassImpl$Data$simpleName$2 extends xka implements Function0<String> {
    final /* synthetic */ KClassImpl<T> this$0;
    final /* synthetic */ KClassImpl<T>.Data this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$simpleName$2(KClassImpl<T> kClassImpl, KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = kClassImpl;
        this.this$1 = data;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final String invoke() {
        ClassId classId;
        String calculateLocalClassName;
        if (this.this$0.getJClass().isAnonymousClass()) {
            return null;
        }
        classId = this.this$0.getClassId();
        if (classId.isLocal()) {
            calculateLocalClassName = this.this$1.calculateLocalClassName(this.this$0.getJClass());
            return calculateLocalClassName;
        }
        String asString = classId.getShortClassName().asString();
        asString.getClass();
        return asString;
    }
}
