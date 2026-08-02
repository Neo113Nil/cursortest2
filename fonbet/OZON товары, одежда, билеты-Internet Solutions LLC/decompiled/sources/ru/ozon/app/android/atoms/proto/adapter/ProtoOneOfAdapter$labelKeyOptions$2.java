package ru.ozon.app.android.atoms.proto.adapter;

import com.squareup.moshi.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/squareup/moshi/n$a;", "invoke", "()Lcom/squareup/moshi/n$a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProtoOneOfAdapter$labelKeyOptions$2 extends AbstractC7737t implements Function0<n.a> {
    final /* synthetic */ ProtoOneOfAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProtoOneOfAdapter$labelKeyOptions$2(ProtoOneOfAdapter protoOneOfAdapter) {
        super(0);
        this.this$0 = protoOneOfAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final n.a invoke() {
        ProtoOneOf protoOneOf;
        protoOneOf = this.this$0.annotation;
        return n.a.C0918a.a(protoOneOf.label());
    }
}
