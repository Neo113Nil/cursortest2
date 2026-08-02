package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f15203a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f15204b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f15205c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f15206d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f15207e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f15206d = iParamsAppender;
        this.f15207e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f15203a.get(this.f15204b)).buildUpon();
        this.f15206d.appendParams(buildUpon, this.f15207e.getConfig());
        this.f15205c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f15203a;
    }

    public String getUrl() {
        return new c(this.f15205c).f15178a;
    }

    public boolean hasMoreHosts() {
        return this.f15204b + 1 < this.f15203a.size();
    }

    public void incrementAttemptNumber() {
        this.f15204b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f15203a = list;
    }
}
