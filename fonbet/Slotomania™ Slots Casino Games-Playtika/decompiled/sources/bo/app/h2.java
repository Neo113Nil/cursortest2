package bo.app;

import com.braze.Constants;
import com.braze.events.IEventSubscriber;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J*\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J*\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\b\u0010\rJ\b\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lbo/app/h2;", "", "T", "Ljava/lang/Class;", "eventClass", "Lcom/braze/events/IEventSubscriber;", "subscriber", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "b", "c", "message", "(Ljava/lang/Object;Ljava/lang/Class;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface h2 {
    void a();

    <T> void a(Class<T> eventClass, IEventSubscriber<T> subscriber);

    <T> void a(T message, Class<T> eventClass);

    <T> boolean b(Class<T> eventClass, IEventSubscriber<T> subscriber);

    <T> boolean c(Class<T> eventClass, IEventSubscriber<T> subscriber);
}
