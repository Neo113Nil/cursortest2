package ru.ozon.app.android.session.editCredential.newCredentials.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.newCredentials.data.TranslationLexemes;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes_ValidationLexemesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;", "isEmptyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsInvalid;", "isInvalidAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TranslationLexemes_ValidationLexemesJsonAdapter extends JsonAdapter<TranslationLexemes.ValidationLexemes> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TranslationLexemes.ValidationLexemes.IsEmpty> isEmptyAdapter;

    @NotNull
    private final JsonAdapter<TranslationLexemes.ValidationLexemes.IsInvalid> isInvalidAdapter;

    @NotNull
    private final n.a options;

    public TranslationLexemes_ValidationLexemesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isEmpty", "isInvalid");
        M m11 = M.f71699a;
        this.isEmptyAdapter = moshi.f(TranslationLexemes.ValidationLexemes.IsEmpty.class, m11, "isEmpty");
        this.isInvalidAdapter = moshi.f(TranslationLexemes.ValidationLexemes.IsInvalid.class, m11, "isInvalid");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(TranslationLexemes.ValidationLexemes)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TranslationLexemes.ValidationLexemes fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TranslationLexemes.ValidationLexemes.IsEmpty isEmpty = null;
        TranslationLexemes.ValidationLexemes.IsInvalid isInvalid = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                isEmpty = this.isEmptyAdapter.fromJson(reader);
                if (isEmpty == null) {
                    throw c.q("isEmpty", "isEmpty", reader);
                }
            } else if (v11 == 1 && (isInvalid = this.isInvalidAdapter.fromJson(reader)) == null) {
                throw c.q("isInvalid", "isInvalid", reader);
            }
        }
        reader.endObject();
        if (isEmpty == null) {
            throw c.j("isEmpty", "isEmpty", reader);
        }
        if (isInvalid != null) {
            return new TranslationLexemes.ValidationLexemes(isEmpty, isInvalid);
        }
        throw c.j("isInvalid", "isInvalid", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TranslationLexemes.ValidationLexemes value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isEmpty");
        this.isEmptyAdapter.mo44toJson(writer, (x) value.isEmpty());
        writer.w("isInvalid");
        this.isInvalidAdapter.mo44toJson(writer, (x) value.isInvalid());
        writer.p();
    }
}
