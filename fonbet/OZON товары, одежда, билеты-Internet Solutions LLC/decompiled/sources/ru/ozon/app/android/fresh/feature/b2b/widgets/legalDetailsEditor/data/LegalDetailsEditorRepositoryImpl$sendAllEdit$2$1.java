package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorResponseDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1", f = "LegalDetailsEditorRepositoryImpl.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1 extends j implements Function2<M, d<? super LegalDetailsEditorResponseDTO>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ Map<String, String> $paramsMap;
    final /* synthetic */ LegalDetailsEditorRepositoryImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1(String str, Map<String, String> map, LegalDetailsEditorRepositoryImpl legalDetailsEditorRepositoryImpl, d<? super LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1> dVar) {
        super(2, dVar);
        this.$message = str;
        this.$paramsMap = map;
        this.$this_runCatching = legalDetailsEditorRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1(this.$message, this.$paramsMap, this.$this_runCatching, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LegalDetailsEditorApi legalDetailsEditorApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("message", this.$message);
        for (Map.Entry<String, String> entry : this.$paramsMap.entrySet()) {
            String value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        legalDetailsEditorApi = this.$this_runCatching.api;
        this.label = 1;
        Object sendAllEdit = legalDetailsEditorApi.sendAllEdit(linkedHashMap, this);
        return sendAllEdit == aVar ? aVar : sendAllEdit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super LegalDetailsEditorResponseDTO> dVar) {
        return ((LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
