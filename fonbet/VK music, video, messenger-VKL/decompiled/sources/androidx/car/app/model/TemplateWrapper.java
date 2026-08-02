package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import xsna.e8o0;
import xsna.i5s;

/* loaded from: classes11.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;

    @Nullable
    private String mId;
    private boolean mIsRefresh;

    @Nullable
    private e8o0 mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper(e8o0 e8o0Var, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = e8o0Var;
        this.mId = str;
    }

    @NonNull
    public static TemplateWrapper copyOf(@NonNull TemplateWrapper templateWrapper) {
        TemplateWrapper wrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        wrap.setRefresh(templateWrapper.isRefresh());
        wrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            wrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return wrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    @NonNull
    public static TemplateWrapper wrap(@NonNull e8o0 e8o0Var) {
        return wrap(e8o0Var, createRandomId());
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    @NonNull
    public String getId() {
        String str = this.mId;
        Objects.requireNonNull(str);
        return str;
    }

    @NonNull
    public e8o0 getTemplate() {
        e8o0 e8o0Var = this.mTemplate;
        Objects.requireNonNull(e8o0Var);
        return e8o0Var;
    }

    @NonNull
    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        List<TemplateInfo> list = this.mTemplateInfoForScreenStack;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(@NonNull String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(@NonNull e8o0 e8o0Var) {
        this.mTemplate = e8o0Var;
    }

    public void setTemplateInfosForScreenStack(@NonNull List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[template: ");
        sb.append(this.mTemplate);
        sb.append(", ID: ");
        return i5s.a(sb, this.mId, X3.j.e);
    }

    @NonNull
    public static TemplateWrapper wrap(@NonNull e8o0 e8o0Var, @NonNull String str) {
        Objects.requireNonNull(e8o0Var);
        Objects.requireNonNull(str);
        return new TemplateWrapper(e8o0Var, str);
    }

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }
}
