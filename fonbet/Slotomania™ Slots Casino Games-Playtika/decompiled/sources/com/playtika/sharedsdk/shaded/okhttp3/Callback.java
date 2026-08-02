package com.playtika.sharedsdk.shaded.okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Callback.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/Callback;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lcom/playtika/sharedsdk/shaded/okhttp3/Call;", "e", "Ljava/io/IOException;", "Lcom/playtika/sharedsdk/shaded/okio/IOException;", "onResponse", "response", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Callback {
    void onFailure(Call call, IOException e);

    void onResponse(Call call, Response response) throws IOException;
}
