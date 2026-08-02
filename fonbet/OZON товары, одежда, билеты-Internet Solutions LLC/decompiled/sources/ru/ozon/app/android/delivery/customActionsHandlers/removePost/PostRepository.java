package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removePost/PostRepository;", "", "Lru/ozon/app/android/delivery/customActionsHandlers/removePost/PostApi;", "api", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/removePost/PostApi;)V", "", "actionName", "postInfo", "Lru/ozon/app/android/utils/Result;", "", "removePost", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/delivery/customActionsHandlers/removePost/PostApi;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostRepository {

    @NotNull
    private final PostApi api;

    public PostRepository(@NotNull PostApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removePost(@NotNull String str, String str2, @NotNull d<? super Result<Unit>> dVar) {
        PostRepository$removePost$1 postRepository$removePost$1;
        int i11;
        try {
            if (dVar instanceof PostRepository$removePost$1) {
                postRepository$removePost$1 = (PostRepository$removePost$1) dVar;
                int i12 = postRepository$removePost$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    postRepository$removePost$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = postRepository$removePost$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = postRepository$removePost$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        PostApi postApi = this.api;
                        RemovePostRequest removePostRequest = new RemovePostRequest(str2);
                        postRepository$removePost$1.label = 1;
                        if (postApi.removePost(str, removePostRequest, postRepository$removePost$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success(Unit.f71690a);
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success(Unit.f71690a);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        postRepository$removePost$1 = new PostRepository$removePost$1(this, dVar);
        Object obj2 = postRepository$removePost$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = postRepository$removePost$1.label;
    }
}
