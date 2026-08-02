package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormInputState;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0000¢\u0006\u0004\b\u0014\u0010\u000eR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR)\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n0\u001c8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "inputName", "newValue", "", "onInputChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "inputs", "onWidgetInputsUpdated", "(Ljava/util/Map;)V", "", "validateInputs$action_handlers_prodGoogleAllVendorsRelease", "()Z", "validateInputs", "errors", "onInputError$action_handlers_prodGoogleAllVendorsRelease", "onInputError", "", "inputsMap", "Ljava/util/Map;", "LAe/x0;", "mutableInputs", "LAe/x0;", "LAe/M0;", "LAe/M0;", "getInputs", "()LAe/M0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "inputsChanged", "Z", "getInputsChanged", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BloggerPersonalDataFormViewModel extends w0 {

    @NotNull
    private final M0<Map<String, BloggerPersonalDataFormInputState>> inputs;
    private boolean inputsChanged;

    @NotNull
    private final Map<String, BloggerPersonalDataFormInputState> inputsMap = new LinkedHashMap();

    @NotNull
    private final x0<Map<String, BloggerPersonalDataFormInputState>> mutableInputs;

    public BloggerPersonalDataFormViewModel() {
        x0<Map<String, BloggerPersonalDataFormInputState>> a11 = O0.a(U.c());
        this.mutableInputs = a11;
        this.inputs = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloggerPersonalDataFormInputState onInputChanged$lambda$0(Function2 function2, Object obj, Object obj2) {
        return (BloggerPersonalDataFormInputState) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloggerPersonalDataFormInputState onInputError$lambda$4$lambda$3(Function2 function2, Object obj, Object obj2) {
        return (BloggerPersonalDataFormInputState) function2.invoke(obj, obj2);
    }

    @NotNull
    public final M0<Map<String, BloggerPersonalDataFormInputState>> getInputs() {
        return this.inputs;
    }

    public final boolean getInputsChanged() {
        return this.inputsChanged;
    }

    public final void onInputChanged(@NotNull String inputName, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Map<String, BloggerPersonalDataFormInputState> map = this.inputsMap;
        final BloggerPersonalDataFormViewModel$onInputChanged$1 bloggerPersonalDataFormViewModel$onInputChanged$1 = new BloggerPersonalDataFormViewModel$onInputChanged$1(newValue);
        map.computeIfPresent(inputName, new BiFunction() { // from class: tl.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                BloggerPersonalDataFormInputState onInputChanged$lambda$0;
                onInputChanged$lambda$0 = BloggerPersonalDataFormViewModel.onInputChanged$lambda$0(Function2.this, obj, obj2);
                return onInputChanged$lambda$0;
            }
        });
        this.inputsChanged = true;
        this.mutableInputs.setValue(U.t(this.inputsMap));
    }

    public final void onInputError$action_handlers_prodGoogleAllVendorsRelease(@NotNull Map<String, String> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        for (Map.Entry<String, String> entry : errors.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Map<String, BloggerPersonalDataFormInputState> map = this.inputsMap;
            final BloggerPersonalDataFormViewModel$onInputError$1$1 bloggerPersonalDataFormViewModel$onInputError$1$1 = new BloggerPersonalDataFormViewModel$onInputError$1$1(value);
            map.computeIfPresent(key, new BiFunction() { // from class: tl.a
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    BloggerPersonalDataFormInputState onInputError$lambda$4$lambda$3;
                    onInputError$lambda$4$lambda$3 = BloggerPersonalDataFormViewModel.onInputError$lambda$4$lambda$3(Function2.this, obj, obj2);
                    return onInputError$lambda$4$lambda$3;
                }
            });
        }
        this.mutableInputs.setValue(U.t(this.inputsMap));
    }

    public final void onWidgetInputsUpdated(@NotNull Map<String, BloggerPersonalDataFormInputState> inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.inputsMap.clear();
        this.inputsMap.putAll(inputs);
        this.inputsChanged = false;
        this.mutableInputs.setValue(U.t(this.inputsMap));
    }

    public final boolean validateInputs$action_handlers_prodGoogleAllVendorsRelease() {
        Map<String, BloggerPersonalDataFormInputState> map = this.inputsMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, BloggerPersonalDataFormInputState> entry : map.entrySet()) {
            BloggerPersonalDataFormInputState value = entry.getValue();
            if (!value.getIsOptional() && h.K(value.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), ((BloggerPersonalDataFormInputState) entry2.getValue()).getEmptyError());
            }
            onInputError$action_handlers_prodGoogleAllVendorsRelease(linkedHashMap2);
        }
        return linkedHashMap.isEmpty();
    }
}
