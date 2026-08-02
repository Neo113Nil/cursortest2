package ru.ozon.app.android.marketing.widgets.actionProgress.data;

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
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressDTO;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "textAtomAdapter", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO$Progress;", "progressAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "nullableHighlightsCurrentMiniWidgetAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "nullableHighlightsWrapperProgressTextAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionProgressDTOJsonAdapter extends JsonAdapter<ActionProgressDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<HighlightsCurrentMiniWidget> nullableHighlightsCurrentMiniWidgetAdapter;

    @NotNull
    private final JsonAdapter<HighlightsWrapperProgressText> nullableHighlightsWrapperProgressTextAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ActionProgressDTO.Progress> progressAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ActionProgressDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "progressText", "progress", "subtitle", "currentMiniWidget", "miniProgressText");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "progressText");
        this.progressAdapter = moshi.f(ActionProgressDTO.Progress.class, m11, "progress");
        this.nullableHighlightsCurrentMiniWidgetAdapter = moshi.f(HighlightsCurrentMiniWidget.class, m11, "currentMiniWidget");
        this.nullableHighlightsWrapperProgressTextAdapter = moshi.f(HighlightsWrapperProgressText.class, m11, "miniProgressText");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(ActionProgressDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionProgressDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        ActionProgressDTO.Progress progress = null;
        TextAtom textAtom2 = null;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = null;
        HighlightsWrapperProgressText highlightsWrapperProgressText = null;
        boolean z11 = false;
        boolean z12 = false;
        TextAtom textAtom3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("progressText", "progressText", reader);
                    }
                    break;
                case 2:
                    progress = this.progressAdapter.fromJson(reader);
                    if (progress == null) {
                        throw c.q("progress", "progress", reader);
                    }
                    break;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    highlightsCurrentMiniWidget = this.nullableHighlightsCurrentMiniWidgetAdapter.fromJson(reader);
                    z11 = true;
                    break;
                case 5:
                    highlightsWrapperProgressText = this.nullableHighlightsWrapperProgressTextAdapter.fromJson(reader);
                    z12 = true;
                    break;
            }
        }
        reader.endObject();
        if (textAtom3 == null) {
            throw c.j("progressText", "progressText", reader);
        }
        if (progress == null) {
            throw c.j("progress", "progress", reader);
        }
        ActionProgressDTO actionProgressDTO = new ActionProgressDTO(textAtom, textAtom3, progress, textAtom2);
        if (z11) {
            actionProgressDTO.setCurrentMiniWidget(highlightsCurrentMiniWidget);
        }
        if (z12) {
            actionProgressDTO.setMiniProgressText(highlightsWrapperProgressText);
        }
        return actionProgressDTO;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionProgressDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("progressText");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getProgressText());
        writer.w("progress");
        this.progressAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("currentMiniWidget");
        this.nullableHighlightsCurrentMiniWidgetAdapter.mo44toJson(writer, (x) value.getCurrentMiniWidget());
        writer.w("miniProgressText");
        this.nullableHighlightsWrapperProgressTextAdapter.mo44toJson(writer, (x) value.getMiniProgressText());
        writer.p();
    }
}
