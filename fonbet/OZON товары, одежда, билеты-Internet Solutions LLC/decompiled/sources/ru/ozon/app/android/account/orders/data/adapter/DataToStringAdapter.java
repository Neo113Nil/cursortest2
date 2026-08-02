package ru.ozon.app.android.account.orders.data.adapter;

import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.data.annotation.DataString;
import sf.C9681g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/data/adapter/DataToStringAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/x;", "writer", "", "string", "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/String;)V", "Lcom/squareup/moshi/n;", "reader", "Lcom/squareup/moshi/JsonAdapter;", "delegate", "fromJson", "(Lcom/squareup/moshi/n;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/String;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DataToStringAdapter {
    @DataString
    @h
    @NotNull
    public final String fromJson(@NotNull n reader, @NotNull JsonAdapter<Object> delegate) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return delegate.toJson(reader.t());
    }

    @C
    public final void toJson(@NotNull x writer, @DataString @NotNull String string) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(string, "string");
        C9681g c9681g = new C9681g();
        c9681g.H0(string);
        writer.X(c9681g);
    }
}
