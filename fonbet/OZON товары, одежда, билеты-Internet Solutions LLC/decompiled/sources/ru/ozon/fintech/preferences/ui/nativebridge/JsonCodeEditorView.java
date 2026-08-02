package ru.ozon.fintech.preferences.ui.nativebridge;

import Ez.ViewOnClickListenerC2978b;
import J90.g;
import J90.h;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import androidx.lifecycle.D;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.ui.nativebridge.JsonCodeEditorView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/preferences/ui/nativebridge/JsonCodeEditorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonCodeEditorView extends ConstraintLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f96999i = 0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f97000c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final CheckBox f97001d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ImageButton f97002e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final h f97003f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final EditText f97004g;

    /* renamed from: h, reason: collision with root package name */
    private g f97005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonCodeEditorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8);
        int px2 = UiExtKt.toPx(40);
        int px3 = UiExtKt.toPx(120);
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setBackgroundColor(a.getColor(context, R.color.aqua_300));
        this.f97000c = view;
        CheckBox checkBox = new CheckBox(context);
        checkBox.setId(View.generateViewId());
        checkBox.setText(context.getString(R.string.fintech_testing_nativebridge_sync_async));
        checkBox.setTextSize(14.0f);
        checkBox.setTypeface(null, 1);
        checkBox.setTextColor(a.getColor(context, R.color.oz_semantic_text_primary));
        this.f97001d = checkBox;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(context.getString(R.string.fintech_testing_nativebridge_parameters_json_or_text));
        textView.setTextSize(14.0f);
        textView.setTextColor(a.getColor(context, R.color.oz_semantic_text_primary));
        textView.setTypeface(textView.getTypeface(), 1);
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(View.generateViewId());
        imageButton.setImageResource(R.drawable.ic_m_delete_text_filled);
        imageButton.setBackground(null);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setContentDescription(context.getString(R.string.fintech_testing_nativebridge_delete_json));
        this.f97002e = imageButton;
        h hVar = new h(context);
        hVar.setId(View.generateViewId());
        this.f97003f = hVar;
        final EditText editText = new EditText(context);
        editText.setId(View.generateViewId());
        editText.setPadding(px, px, 0, 0);
        editText.setBackgroundResource(android.R.color.transparent);
        editText.setGravity(8388659);
        editText.setHint(R.string.fintech_testing_nativebridge_choose_group_and_method);
        editText.setTextAppearance(android.R.style.TextAppearance.Material.Medium);
        editText.setInputType(655361);
        editText.setHorizontallyScrolling(false);
        editText.setMovementMethod(null);
        editText.setVerticalScrollBarEnabled(true);
        editText.setLineSpacing(0.0f, 1.1f);
        editText.setTextColor(a.getColor(context, R.color.oz_semantic_text_primary));
        editText.setTypeface(Typeface.MONOSPACE);
        editText.setMinHeight(px3);
        editText.setFocusableInTouchMode(true);
        editText.setIncludeFontPadding(false);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: J90.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                int i11 = JsonCodeEditorView.f96999i;
                EditText editText2 = editText;
                if (z11) {
                    editText2.setHint(R.string.fintech_testing_nativebridge_choose_group_and_method_sync);
                } else {
                    editText2.setHint(R.string.fintech_testing_nativebridge_choose_group_and_method);
                }
            }
        });
        this.f97004g = editText;
        setBackground(C7232a.a(context, R.drawable.fintech_ultra_round_bg));
        addView(view, new ConstraintLayout.b(0, px2));
        addView(checkBox, new ConstraintLayout.b(-2, -2));
        addView(textView, new ConstraintLayout.b(-2, -2));
        addView(imageButton, new ConstraintLayout.b(px2, px2));
        addView(hVar, new ConstraintLayout.b(-2, 0));
        addView(editText, new ConstraintLayout.b(0, -2));
        d dVar = new d();
        dVar.p(this);
        dVar.s(view.getId(), 3, 0, 3);
        dVar.s(view.getId(), 6, 0, 6);
        dVar.s(view.getId(), 7, 0, 7);
        dVar.t(textView.getId(), 6, view.getId(), 6, px);
        dVar.s(textView.getId(), 3, view.getId(), 3);
        dVar.s(textView.getId(), 4, view.getId(), 4);
        dVar.t(checkBox.getId(), 6, textView.getId(), 7, px);
        dVar.s(checkBox.getId(), 3, view.getId(), 3);
        dVar.s(checkBox.getId(), 4, view.getId(), 4);
        dVar.s(imageButton.getId(), 7, view.getId(), 7);
        dVar.s(imageButton.getId(), 3, view.getId(), 3);
        dVar.s(imageButton.getId(), 4, view.getId(), 4);
        dVar.t(hVar.getId(), 6, 0, 6, px);
        dVar.s(hVar.getId(), 3, view.getId(), 4);
        dVar.t(hVar.getId(), 4, 0, 4, px);
        dVar.s(editText.getId(), 6, hVar.getId(), 7);
        dVar.t(editText.getId(), 7, 0, 7, px);
        dVar.s(editText.getId(), 3, view.getId(), 4);
        dVar.t(editText.getId(), 4, 0, 4, px);
        dVar.f(this);
    }

    public static void b(JsonCodeEditorView jsonCodeEditorView) {
        jsonCodeEditorView.f97004g.getText().clear();
    }

    public final void c() {
        g gVar = this.f97005h;
        if (gVar != null) {
            gVar.p();
        }
        this.f97005h = null;
        this.f97003f.b();
    }

    public final boolean d() {
        return this.f97001d.isChecked();
    }

    @NotNull
    public final String e() {
        String obj;
        Editable text = this.f97004g.getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final void f() {
        g gVar = this.f97005h;
        if (gVar != null) {
            gVar.q(true);
            Unit unit = Unit.f71690a;
        }
    }

    public final void g(@NotNull D scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f97005h != null) {
            return;
        }
        g gVar = new g(scope);
        this.f97005h = gVar;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gVar.r(context);
        g gVar2 = this.f97005h;
        EditText editText = this.f97004g;
        if (gVar2 != null) {
            gVar2.o(editText);
        }
        this.f97003f.a(editText);
        this.f97002e.setOnClickListener(new ViewOnClickListenerC2978b(this, 2));
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        EditText editText = this.f97004g;
        editText.setText(text);
        g gVar = this.f97005h;
        if (gVar != null) {
            gVar.q(true);
        }
        Editable text2 = editText.getText();
        int length = text2 != null ? text2.length() : 0;
        editText.setSelection(length < 0 ? length : 0);
    }
}
