package ru.ozon.android.messenger.framework.data.remote.parser;

import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.F;
import sf.G;
import sf.InterfaceC9683i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/parser/SymmetricDataStringAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/x;", "writer", "", "jsonString", "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/String;)V", "Lcom/squareup/moshi/n;", "reader", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "fromJson", "(Lcom/squareup/moshi/n;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/String;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SymmetricDataStringAdapter {
    @DataString
    @h
    @NotNull
    public final String fromJson(@NotNull n reader, @NotNull JsonAdapter<Object> adapter) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Object t2 = reader.t();
        Intrinsics.f(t2);
        String json = adapter.toJson(t2);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @C
    public final void toJson(@NotNull x writer, @DataString @NotNull String jsonString) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        C9681g source = new C9681g();
        source.H0(jsonString);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        F Z11 = writer.Z();
        try {
            InterfaceC9683i o11 = pVar.o();
            try {
                Z11.y0(o11);
                ((G) o11).close();
                Z11.close();
            } finally {
            }
        } finally {
        }
    }
}
