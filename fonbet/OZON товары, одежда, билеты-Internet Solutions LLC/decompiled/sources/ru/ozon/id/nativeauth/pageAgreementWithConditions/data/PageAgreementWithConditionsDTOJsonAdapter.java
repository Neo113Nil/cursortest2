package ru.ozon.id.nativeauth.pageAgreementWithConditions.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "agreementSheetAdapter", "Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$HintButton;", "hintButtonAdapter", "Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO$Notification;", "notificationAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PageAgreementWithConditionsDTOJsonAdapter extends JsonAdapter<PageAgreementWithConditionsDTO> {

    @NotNull
    private final JsonAdapter<OtpDTO.AgreementSheet> agreementSheetAdapter;

    @NotNull
    private final JsonAdapter<PageAgreementWithConditionsDTO.HintButton> hintButtonAdapter;

    @NotNull
    private final JsonAdapter<PageAgreementWithConditionsDTO.Notification> notificationAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PageAgreementWithConditionsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("action", "agreementBlock", "hintButton", "notification");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<OtpDTO.AgreementSheet> f11 = moshi.f(OtpDTO.AgreementSheet.class, m11, "agreementBlock");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.agreementSheetAdapter = f11;
        JsonAdapter<PageAgreementWithConditionsDTO.HintButton> f12 = moshi.f(PageAgreementWithConditionsDTO.HintButton.class, m11, "hintButton");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.hintButtonAdapter = f12;
        JsonAdapter<PageAgreementWithConditionsDTO.Notification> f13 = moshi.f(PageAgreementWithConditionsDTO.Notification.class, m11, "notification");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.notificationAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(PageAgreementWithConditionsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PageAgreementWithConditionsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        OtpDTO.AgreementSheet agreementSheet = null;
        PageAgreementWithConditionsDTO.HintButton hintButton = null;
        PageAgreementWithConditionsDTO.Notification notification = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("action", "action", reader);
                }
            } else if (v11 == 1) {
                agreementSheet = this.agreementSheetAdapter.fromJson(reader);
                if (agreementSheet == null) {
                    throw c.q("agreementBlock", "agreementBlock", reader);
                }
            } else if (v11 == 2) {
                hintButton = this.hintButtonAdapter.fromJson(reader);
                if (hintButton == null) {
                    throw c.q("hintButton", "hintButton", reader);
                }
            } else if (v11 == 3 && (notification = this.notificationAdapter.fromJson(reader)) == null) {
                throw c.q("notification", "notification", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("action", "action", reader);
        }
        if (agreementSheet == null) {
            throw c.j("agreementBlock", "agreementBlock", reader);
        }
        if (hintButton == null) {
            throw c.j("hintButton", "hintButton", reader);
        }
        if (notification != null) {
            return new PageAgreementWithConditionsDTO(str, agreementSheet, hintButton, notification);
        }
        throw c.j("notification", "notification", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PageAgreementWithConditionsDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("action");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("agreementBlock");
        this.agreementSheetAdapter.mo44toJson(writer, (x) value_.getAgreementBlock());
        writer.w("hintButton");
        this.hintButtonAdapter.mo44toJson(writer, (x) value_.getHintButton());
        writer.w("notification");
        this.notificationAdapter.mo44toJson(writer, (x) value_.getNotification());
        writer.p();
    }
}
