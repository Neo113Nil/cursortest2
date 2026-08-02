package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import defpackage.wx4;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagnosticTagKt {

    @NotNull
    public static final DiagnosticTagKt INSTANCE = new DiagnosticTagKt();

    private DiagnosticTagKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002DEB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J%\u0010\u0010\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0013J&\u0010\u0014\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0087\n¢\u0006\u0002\b\u0015J+\u0010\u0016\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0002\b\u0019J,\u0010\u0014\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0087\n¢\u0006\u0002\b\u001aJ.\u0010\u001b\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001eJ\u001d\u0010\u001f\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0002\b J\u0006\u0010'\u001a\u00020\u0011J\u0006\u0010(\u001a\u00020)J\u0006\u0010-\u001a\u00020\u0011J\u0006\u0010.\u001a\u00020)J\u0006\u00104\u001a\u00020\u0011J\u0006\u00105\u001a\u00020)J\u0006\u0010>\u001a\u00020\u0011J\u0006\u0010C\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R$\u0010/\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u00101\"\u0004\b=\u00103R\u0011\u0010?\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$Builder;", "<init>", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$Builder;)V", "_build", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "tagType", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "Lgatewayprotocol/v1/DiagnosticTagKt$Dsl$TagTypeProxy;", "getTagType$annotations", "()V", "getTagType", "()Lcom/google/protobuf/kotlin/DslList;", "add", "", U3.i.X, "addTagType", "plusAssign", "plusAssignTagType", "addAll", "values", "", "addAllTagType", "plusAssignAllTagType", "set", "index", "", "setTagType", "clear", "clearTagType", "", "customTagType", "getCustomTagType", "()Ljava/lang/String;", "setCustomTagType", "(Ljava/lang/String;)V", "clearCustomTagType", "hasCustomTagType", "", "stringValue", "getStringValue", "setStringValue", "clearStringValue", "hasStringValue", "intValue", "getIntValue", "()I", "setIntValue", "(I)V", "clearIntValue", "hasIntValue", "type", "getType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "setType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;)V", "typeValue", "getTypeValue", "setTypeValue", "clearType", "valueCase", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$ValueCase;", "clearValue", "Companion", "TagTypeProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DiagnosticEventRequestOuterClass.DiagnosticTag.Builder _builder;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt$Dsl$TagTypeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TagTypeProxy extends DslProxy {
            private TagTypeProxy() {
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticTag _build() {
            DiagnosticEventRequestOuterClass.DiagnosticTag build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllTagType(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllTagType(iterable);
        }

        public final /* synthetic */ void addTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            dslList.getClass();
            diagnosticTagType.getClass();
            this._builder.addTagType(diagnosticTagType);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final /* synthetic */ void clearTagType(DslList dslList) {
            dslList.getClass();
            this._builder.clearTagType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @NotNull
        public final String getCustomTagType() {
            String customTagType = this._builder.getCustomTagType();
            customTagType.getClass();
            return customTagType;
        }

        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        @NotNull
        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            stringValue.getClass();
            return stringValue;
        }

        public final /* synthetic */ DslList getTagType() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTagType> tagTypeList = this._builder.getTagTypeList();
            tagTypeList.getClass();
            return new DslList(tagTypeList);
        }

        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticTagType getType() {
            DiagnosticEventRequestOuterClass.DiagnosticTagType type = this._builder.getType();
            type.getClass();
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase valueCase = this._builder.getValueCase();
            valueCase.getClass();
            return valueCase;
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final /* synthetic */ void plusAssignAllTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticTagType> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllTagType(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            dslList.getClass();
            diagnosticTagType.getClass();
            addTagType(dslList, diagnosticTagType);
        }

        public final void setCustomTagType(@NotNull String str) {
            str.getClass();
            this._builder.setCustomTagType(str);
        }

        public final void setIntValue(int i) {
            this._builder.setIntValue(i);
        }

        public final void setStringValue(@NotNull String str) {
            str.getClass();
            this._builder.setStringValue(str);
        }

        public final /* synthetic */ void setTagType(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            dslList.getClass();
            diagnosticTagType.getClass();
            this._builder.setTagType(i, diagnosticTagType);
        }

        public final void setType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            this._builder.setType(diagnosticTagType);
        }

        public final void setTypeValue(int i) {
            this._builder.setTypeValue(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticTagKt$Dsl;", "builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @wx4
        public static /* synthetic */ void getTagType$annotations() {
        }
    }
}
