package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileViewModel;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileViewModel$downloadFile$1", f = "B2bDownloadFileViewModel.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 50, 57}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bDownloadFileViewModel$downloadFile$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ File $cacheDir;
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ String $postData;
    int label;
    final /* synthetic */ B2bDownloadFileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bDownloadFileViewModel$downloadFile$1(B2bDownloadFileViewModel b2bDownloadFileViewModel, String str, JsonParser jsonParser, String str2, File file, d<? super B2bDownloadFileViewModel$downloadFile$1> dVar) {
        super(2, dVar);
        this.this$0 = b2bDownloadFileViewModel;
        this.$postData = str;
        this.$jsonDeserializer = jsonParser;
        this.$actionName = str2;
        this.$cacheDir = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bDownloadFileViewModel$downloadFile$1(this.this$0, this.$postData, this.$jsonDeserializer, this.$actionName, this.$cacheDir, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
    
        if (r7 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        B2bDownloadFileRepository b2bDownloadFileRepository;
        x0 x0Var2;
        String fileNameFromResponse;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._screenState;
            x0Var.setValue(B2bDownloadFileViewModel.ScreenState.Loading.INSTANCE);
            B2bDownloadFileViewModel b2bDownloadFileViewModel = this.this$0;
            String str = this.$postData;
            JsonParser jsonParser = this.$jsonDeserializer;
            this.label = 1;
            obj = b2bDownloadFileViewModel.getFileId(str, jsonParser, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    File file = (File) obj;
                    x0Var5 = this.this$0._screenState;
                    x0Var5.setValue(file != null ? new B2bDownloadFileViewModel.ScreenState.Success(file) : B2bDownloadFileViewModel.ScreenState.Error.INSTANCE);
                    return Unit.f71690a;
                }
                s.b(obj);
                Result result = (Result) obj;
                if (result instanceof Result.Failure) {
                    x0Var4 = this.this$0._screenState;
                    x0Var4.setValue(B2bDownloadFileViewModel.ScreenState.Error.INSTANCE);
                } else {
                    if (!(result instanceof Result.Success)) {
                        throw new o();
                    }
                    Response response = (Response) ((Result.Success) result).getValue();
                    fileNameFromResponse = this.this$0.getFileNameFromResponse(response);
                    We.M m11 = (We.M) response.body();
                    if (m11 != null) {
                        B2bDownloadFileViewModel b2bDownloadFileViewModel2 = this.this$0;
                        File file2 = this.$cacheDir;
                        this.label = 3;
                        obj = b2bDownloadFileViewModel2.saveToFile(m11, file2, fileNameFromResponse, this);
                    } else {
                        x0Var3 = this.this$0._screenState;
                        x0Var3.setValue(B2bDownloadFileViewModel.ScreenState.Error.INSTANCE);
                    }
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            x0Var2 = this.this$0._screenState;
            x0Var2.setValue(B2bDownloadFileViewModel.ScreenState.Error.INSTANCE);
            return Unit.f71690a;
        }
        b2bDownloadFileRepository = this.this$0.repository;
        String str3 = this.$actionName;
        this.label = 2;
        obj = b2bDownloadFileRepository.downloadFile(str3, str2, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((B2bDownloadFileViewModel$downloadFile$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
