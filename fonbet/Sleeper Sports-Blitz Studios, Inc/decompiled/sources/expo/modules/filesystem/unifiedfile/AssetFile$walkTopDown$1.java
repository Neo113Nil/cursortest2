package expo.modules.filesystem.unifiedfile;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

/* compiled from: AssetFile.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lexpo/modules/filesystem/unifiedfile/AssetFile;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1", f = "AssetFile.kt", i = {0, 1, 1}, l = {134, 140}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class AssetFile$walkTopDown$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super AssetFile>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AssetFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetFile$walkTopDown$1(AssetFile assetFile, Continuation<? super AssetFile$walkTopDown$1> continuation) {
        super(2, continuation);
        this.this$0 = assetFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetFile$walkTopDown$1 assetFile$walkTopDown$1 = new AssetFile$walkTopDown$1(this.this$0, continuation);
        assetFile$walkTopDown$1.L$0 = obj;
        return assetFile$walkTopDown$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super AssetFile> sequenceScope, Continuation<? super Unit> continuation) {
        return ((AssetFile$walkTopDown$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cb, code lost:
    
        if (r7.yieldAll(r13, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r1.yield(r12.this$0, r12) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00cb -> B:6:0x00ce). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        Context context;
        SequenceScope sequenceScope2;
        int length;
        AssetFile assetFile;
        int i;
        String[] strArr;
        Context context2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            this.L$0 = sequenceScope;
            this.label = 1;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.I$1;
                i = this.I$0;
                assetFile = (AssetFile) this.L$2;
                strArr = (String[]) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i++;
                if (i < length) {
                    String str = strArr[i];
                    if (assetFile.getPath().length() != 0) {
                        str = assetFile.getPath() + "/" + str;
                    }
                    context2 = assetFile.context;
                    Sequence<AssetFile> walkTopDown = new AssetFile(context2, Uri.parse("asset:///" + str)).walkTopDown();
                    this.L$0 = sequenceScope2;
                    this.L$1 = strArr;
                    this.L$2 = assetFile;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.label = 2;
                }
                return Unit.INSTANCE;
            }
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (this.this$0.isDirectory()) {
            context = this.this$0.context;
            String[] list = context.getAssets().list(this.this$0.getPath());
            if (list != null) {
                AssetFile assetFile2 = this.this$0;
                sequenceScope2 = sequenceScope;
                length = list.length;
                assetFile = assetFile2;
                i = 0;
                strArr = list;
                if (i < length) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
