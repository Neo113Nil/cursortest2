package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data;

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
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/deprecated/Annotation;", "annotationAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions;", "conditionsAdapter", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason;", "nullableReasonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountDescriptionDTOJsonAdapter extends JsonAdapter<DeleteAccountDescriptionDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Annotation> annotationAdapter;

    @NotNull
    private final JsonAdapter<DeleteAccountDescriptionDTO.Conditions> conditionsAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<DeleteAccountDescriptionDTO.Reason> nullableReasonAdapter;

    @NotNull
    private final n.a options;

    public DeleteAccountDescriptionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "conditions", "reason", "stickyButton");
        M m11 = M.f71699a;
        this.annotationAdapter = moshi.f(Annotation.class, m11, DeleteAccountApiResponse.Error.TYPE_RESTRICTION);
        this.conditionsAdapter = moshi.f(DeleteAccountDescriptionDTO.Conditions.class, m11, "conditions");
        this.nullableReasonAdapter = moshi.f(DeleteAccountDescriptionDTO.Reason.class, m11, "reason");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "stickyButton");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(DeleteAccountDescriptionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeleteAccountDescriptionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Annotation annotation = null;
        DeleteAccountDescriptionDTO.Conditions conditions = null;
        DeleteAccountDescriptionDTO.Reason reason = null;
        ButtonV3Atom.LargeButton largeButton = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                annotation = this.annotationAdapter.fromJson(reader);
                if (annotation == null) {
                    throw c.q(DeleteAccountApiResponse.Error.TYPE_RESTRICTION, DeleteAccountApiResponse.Error.TYPE_RESTRICTION, reader);
                }
            } else if (v11 == 1) {
                conditions = this.conditionsAdapter.fromJson(reader);
                if (conditions == null) {
                    throw c.q("conditions", "conditions", reader);
                }
            } else if (v11 == 2) {
                reason = this.nullableReasonAdapter.fromJson(reader);
            } else if (v11 == 3) {
                largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (annotation == null) {
            throw c.j(DeleteAccountApiResponse.Error.TYPE_RESTRICTION, DeleteAccountApiResponse.Error.TYPE_RESTRICTION, reader);
        }
        if (conditions != null) {
            return new DeleteAccountDescriptionDTO(annotation, conditions, reason, largeButton);
        }
        throw c.j("conditions", "conditions", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeleteAccountDescriptionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DeleteAccountApiResponse.Error.TYPE_RESTRICTION);
        this.annotationAdapter.mo44toJson(writer, (x) value.getRestriction());
        writer.w("conditions");
        this.conditionsAdapter.mo44toJson(writer, (x) value.getConditions());
        writer.w("reason");
        this.nullableReasonAdapter.mo44toJson(writer, (x) value.getReason());
        writer.w("stickyButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getStickyButton());
        writer.p();
    }
}
