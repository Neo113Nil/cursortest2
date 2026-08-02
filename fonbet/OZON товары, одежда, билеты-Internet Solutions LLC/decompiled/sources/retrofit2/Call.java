package retrofit2;

import We.G;
import java.io.IOException;
import sf.N;

/* loaded from: classes6.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    G request();

    N timeout();
}
