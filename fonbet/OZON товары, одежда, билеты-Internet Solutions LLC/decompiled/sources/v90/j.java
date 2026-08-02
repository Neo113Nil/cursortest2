package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.ui.nativebridge.JsonCodeEditorView;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class j implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102679a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f102680b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f102681c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f102682d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final EditText f102683e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f102684f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f102685g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final JsonCodeEditorView f102686h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Spinner f102687i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Spinner f102688j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final Spinner f102689k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final StatusResultView f102690l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102691m;

    private j(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull EditText editText, @NonNull EditText editText2, @NonNull FloatingActionButton floatingActionButton, @NonNull FloatingActionButton floatingActionButton2, @NonNull JsonCodeEditorView jsonCodeEditorView, @NonNull Spinner spinner, @NonNull Spinner spinner2, @NonNull Spinner spinner3, @NonNull StatusResultView statusResultView, @NonNull FinToolbarView finToolbarView) {
        this.f102679a = constraintLayout;
        this.f102680b = appCompatImageButton;
        this.f102681c = appCompatImageButton2;
        this.f102682d = editText;
        this.f102683e = editText2;
        this.f102684f = floatingActionButton;
        this.f102685g = floatingActionButton2;
        this.f102686h = jsonCodeEditorView;
        this.f102687i = spinner;
        this.f102688j = spinner2;
        this.f102689k = spinner3;
        this.f102690l = statusResultView;
        this.f102691m = finToolbarView;
    }

    @NonNull
    public static j b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_testing_native_bridge_fragment, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i11 = R.id.btn_edit_group;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(R.id.btn_edit_group, inflate);
        if (appCompatImageButton != null) {
            i11 = R.id.btn_edit_method;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) C2548q.d(R.id.btn_edit_method, inflate);
            if (appCompatImageButton2 != null) {
                i11 = R.id.et_manual_group;
                EditText editText = (EditText) C2548q.d(R.id.et_manual_group, inflate);
                if (editText != null) {
                    i11 = R.id.et_manual_method;
                    EditText editText2 = (EditText) C2548q.d(R.id.et_manual_method, inflate);
                    if (editText2 != null) {
                        i11 = R.id.fab_copy;
                        FloatingActionButton floatingActionButton = (FloatingActionButton) C2548q.d(R.id.fab_copy, inflate);
                        if (floatingActionButton != null) {
                            i11 = R.id.fab_run;
                            FloatingActionButton floatingActionButton2 = (FloatingActionButton) C2548q.d(R.id.fab_run, inflate);
                            if (floatingActionButton2 != null) {
                                i11 = R.id.group_barrier;
                                if (((Barrier) C2548q.d(R.id.group_barrier, inflate)) != null) {
                                    i11 = R.id.json_editor_view;
                                    JsonCodeEditorView jsonCodeEditorView = (JsonCodeEditorView) C2548q.d(R.id.json_editor_view, inflate);
                                    if (jsonCodeEditorView != null) {
                                        i11 = R.id.method_barrier;
                                        if (((Barrier) C2548q.d(R.id.method_barrier, inflate)) != null) {
                                            i11 = R.id.spinner_group;
                                            Spinner spinner = (Spinner) C2548q.d(R.id.spinner_group, inflate);
                                            if (spinner != null) {
                                                i11 = R.id.spinner_method;
                                                Spinner spinner2 = (Spinner) C2548q.d(R.id.spinner_method, inflate);
                                                if (spinner2 != null) {
                                                    i11 = R.id.spinner_presets;
                                                    Spinner spinner3 = (Spinner) C2548q.d(R.id.spinner_presets, inflate);
                                                    if (spinner3 != null) {
                                                        i11 = R.id.status_result_view;
                                                        StatusResultView statusResultView = (StatusResultView) C2548q.d(R.id.status_result_view, inflate);
                                                        if (statusResultView != null) {
                                                            i11 = R.id.tool_bar;
                                                            FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                                            if (finToolbarView != null) {
                                                                i11 = R.id.tv_label_group;
                                                                if (((TextView) C2548q.d(R.id.tv_label_group, inflate)) != null) {
                                                                    i11 = R.id.tv_label_method;
                                                                    if (((TextView) C2548q.d(R.id.tv_label_method, inflate)) != null) {
                                                                        i11 = R.id.tv_label_preset;
                                                                        if (((TextView) C2548q.d(R.id.tv_label_preset, inflate)) != null) {
                                                                            return new j(constraintLayout, appCompatImageButton, appCompatImageButton2, editText, editText2, floatingActionButton, floatingActionButton2, jsonCodeEditorView, spinner, spinner2, spinner3, statusResultView, finToolbarView);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f102679a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102679a;
    }
}
