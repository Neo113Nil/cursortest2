package com.vk.photo.editor.ivm;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.d5p;
import xsna.f5p;
import xsna.g5p;
import xsna.i4p;
import xsna.s3q0;
import xsna.spj;
import xsna.w3p;
import xsna.wzs;
import xsna.yvj;
import xsna.z9;

/* compiled from: EditorStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.EditorStore$setImage$1", f = "EditorStore.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ EditorMessage.f $message;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, EditorMessage.f fVar, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$message = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.this$0, this.$message, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0067 -> B:6:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0081 -> B:5:0x0084). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map linkedHashMap;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            linkedHashMap = new LinkedHashMap();
            it = ((w3p) this.this$0.f.c).c.entrySet().iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d5p d5pVar = (d5p) this.L$4;
            it = (Iterator) this.L$2;
            linkedHashMap = (Map) this.L$0;
            kotlin.a.a(obj);
            d5p d5pVar2 = d5pVar;
            g5p g5pVar = (g5p) obj;
            d5p d5pVar3 = d5pVar2;
            if (g5pVar != null) {
                linkedHashMap.put(d5pVar3.getId(), g5pVar);
            }
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f5p f5pVar = (f5p) entry.getKey();
                d5pVar3 = (d5p) entry.getValue();
                g5pVar = this.$message.b.get(f5pVar);
                if (g5pVar == null) {
                    i4p i4pVar = this.$message.a;
                    this.L$0 = linkedHashMap;
                    this.L$1 = null;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = d5pVar3;
                    this.label = 1;
                    Object u = d5pVar3.u(i4pVar, this);
                    if (u == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d5pVar = d5pVar3;
                    obj = u;
                    d5p d5pVar22 = d5pVar;
                    g5p g5pVar2 = (g5p) obj;
                    d5p d5pVar32 = d5pVar22;
                }
                if (g5pVar2 != null) {
                }
                if (it.hasNext()) {
                    z9 z9Var = this.this$0.a;
                    EditorMessage.f fVar = this.$message;
                    z9Var.d(new a.g(fVar.a, linkedHashMap, fVar.c));
                    return s3q0.a;
                }
            }
        }
    }
}
