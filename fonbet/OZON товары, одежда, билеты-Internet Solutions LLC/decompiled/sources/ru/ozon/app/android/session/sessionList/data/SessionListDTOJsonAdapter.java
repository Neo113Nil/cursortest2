package ru.ozon.app.android.session.sessionList.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.session.sessionList.data.SessionListDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/sessionList/data/SessionListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/sessionList/data/SessionListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$CurrentSessionDTO;", "nullableCurrentSessionDTOAdapter", "nullableStringAdapter", "", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "nullableListOfSessionDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListDTOJsonAdapter extends JsonAdapter<SessionListDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<SessionListDTO.CurrentSessionDTO> nullableCurrentSessionDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<SessionListDTO.SessionDTO>> nullableListOfSessionDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SessionListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("annotation", "listTitle", "listSubtitle", "currentSession", "sessionsTitle", "sessions", "logoutOnAll");
        M m11 = M.f71699a;
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.stringAdapter = moshi.f(String.class, m11, "listTitle");
        this.nullableCurrentSessionDTOAdapter = moshi.f(SessionListDTO.CurrentSessionDTO.class, m11, "currentSession");
        this.nullableStringAdapter = moshi.f(String.class, m11, "sessionsTitle");
        this.nullableListOfSessionDTOAdapter = moshi.f(D.e(List.class, SessionListDTO.SessionDTO.class), m11, "sessions");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "logoutOnAll");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(SessionListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SessionListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DisclaimerAtom disclaimerAtom = null;
        String str = null;
        String str2 = null;
        SessionListDTO.CurrentSessionDTO currentSessionDTO = null;
        String str3 = null;
        List<SessionListDTO.SessionDTO> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("listTitle", "listTitle", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("listSubtitle", "listSubtitle", reader);
                    }
                    break;
                case 3:
                    currentSessionDTO = this.nullableCurrentSessionDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.nullableListOfSessionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("listTitle", "listTitle", reader);
        }
        if (str2 != null) {
            return new SessionListDTO(disclaimerAtom, str, str2, currentSessionDTO, str3, list, largeButton);
        }
        throw c.j("listSubtitle", "listSubtitle", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SessionListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("listTitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getListTitle());
        writer.w("listSubtitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getListSubtitle());
        writer.w("currentSession");
        this.nullableCurrentSessionDTOAdapter.mo44toJson(writer, (x) value.getCurrentSession());
        writer.w("sessionsTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSessionsTitle());
        writer.w("sessions");
        this.nullableListOfSessionDTOAdapter.mo44toJson(writer, (x) value.getSessions());
        writer.w("logoutOnAll");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getLogoutOnAll());
        writer.p();
    }
}
