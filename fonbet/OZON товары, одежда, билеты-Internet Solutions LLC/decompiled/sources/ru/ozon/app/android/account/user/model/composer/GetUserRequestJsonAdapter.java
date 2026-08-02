package ru.ozon.app.android.account.user.model.composer;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/user/model/composer/GetUserRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/user/model/composer/GetUserRequest;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/user/model/composer/GetUserRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetUserRequestJsonAdapter extends JsonAdapter<GetUserRequest> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<GetUserRequest> constructorRef;

    @NotNull
    private final n.a options;

    public GetUserRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(Scopes.EMAIL, "phone", "public", Scopes.PROFILE, "contacts");
        this.booleanAdapter = moshi.f(Boolean.TYPE, M.f71699a, Scopes.EMAIL);
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(GetUserRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GetUserRequest fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q(Scopes.EMAIL, Scopes.EMAIL, reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                bool3 = this.booleanAdapter.fromJson(reader);
                if (bool3 == null) {
                    throw c.q("phone", "phone", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                bool4 = this.booleanAdapter.fromJson(reader);
                if (bool4 == null) {
                    throw c.q("public_", "public", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                bool5 = this.booleanAdapter.fromJson(reader);
                if (bool5 == null) {
                    throw c.q(Scopes.PROFILE, Scopes.PROFILE, reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                bool6 = this.booleanAdapter.fromJson(reader);
                if (bool6 == null) {
                    throw c.q("contacts", "contacts", reader);
                }
                i11 &= -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -32) {
            return new GetUserRequest(bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue());
        }
        Constructor<GetUserRequest> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = GetUserRequest.class.getDeclaredConstructor(cls2, cls2, cls2, cls2, cls2, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        GetUserRequest newInstance = constructor.newInstance(bool2, bool3, bool4, bool5, bool6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GetUserRequest value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(Scopes.EMAIL);
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getEmail()));
        writer.w("phone");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getPhone()));
        writer.w("public");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getPublic()));
        writer.w(Scopes.PROFILE);
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getProfile()));
        writer.w("contacts");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getContacts()));
        writer.p();
    }
}
