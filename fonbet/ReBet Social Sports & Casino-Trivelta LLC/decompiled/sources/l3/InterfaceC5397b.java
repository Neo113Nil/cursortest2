package l3;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q3.AbstractC6109a;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Ll3/b;", "", "", "countryCode", "", "Lq3/a;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paystack_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5397b {
    @GET("/address_verification/states")
    @Nullable
    Object a(@NotNull @Query("country") String str, @NotNull Continuation<? super List<AbstractC6109a>> continuation);
}
