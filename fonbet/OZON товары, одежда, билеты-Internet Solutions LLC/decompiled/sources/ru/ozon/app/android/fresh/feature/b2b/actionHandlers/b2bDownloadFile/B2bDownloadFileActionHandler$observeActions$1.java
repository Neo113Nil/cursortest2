package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import An.C2439a;
import Sc.o;
import Sc.s;
import Wc.a;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileActionHandler$observeActions$1", f = "B2bDownloadFileActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bDownloadFileActionHandler$observeActions$1 extends j implements Function2<B2bDownloadFileViewModel.ScreenState, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ B2bDownloadFileViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ B2bDownloadFileActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bDownloadFileActionHandler$observeActions$1(CustomActionHandler.HandlerReferences handlerReferences, B2bDownloadFileActionHandler b2bDownloadFileActionHandler, B2bDownloadFileViewModel b2bDownloadFileViewModel, d<? super B2bDownloadFileActionHandler$observeActions$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.this$0 = b2bDownloadFileActionHandler;
        this.$viewModel = b2bDownloadFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        B2bDownloadFileActionHandler$observeActions$1 b2bDownloadFileActionHandler$observeActions$1 = new B2bDownloadFileActionHandler$observeActions$1(this.$handlerRefs, this.this$0, this.$viewModel, dVar);
        b2bDownloadFileActionHandler$observeActions$1.L$0 = obj;
        return b2bDownloadFileActionHandler$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B2bDownloadFileViewModel.ScreenState screenState = (B2bDownloadFileViewModel.ScreenState) this.L$0;
        if (Intrinsics.d(screenState, B2bDownloadFileViewModel.ScreenState.Idle.INSTANCE)) {
            this.$handlerRefs.getRefs().getController().hideLoader();
        } else if (Intrinsics.d(screenState, B2bDownloadFileViewModel.ScreenState.Loading.INSTANCE)) {
            C2439a.b(0L, null, 3, this.$handlerRefs.getRefs().getController());
        } else if (Intrinsics.d(screenState, B2bDownloadFileViewModel.ScreenState.Error.INSTANCE)) {
            this.$handlerRefs.getRefs().getController().hideLoader();
            this.this$0.showError(this.$handlerRefs);
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
        } else {
            if (!(screenState instanceof B2bDownloadFileViewModel.ScreenState.Success)) {
                throw new o();
            }
            this.$handlerRefs.getRefs().getController().hideLoader();
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
            try {
                r i11 = this.$handlerRefs.getRefs().getContainer().i();
                Uri d11 = FileProvider.d(i11, i11.getPackageName() + ".fileprovider", ((B2bDownloadFileViewModel.ScreenState.Success) screenState).getFile());
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(((B2bDownloadFileViewModel.ScreenState.Success) screenState).getFile().getPath()));
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = "*/*";
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", d11);
                intent.setType(mimeTypeFromExtension);
                i11.startActivity(Intent.createChooser(intent, null));
            } catch (Exception unused) {
                this.this$0.showError(this.$handlerRefs);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(B2bDownloadFileViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((B2bDownloadFileActionHandler$observeActions$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
