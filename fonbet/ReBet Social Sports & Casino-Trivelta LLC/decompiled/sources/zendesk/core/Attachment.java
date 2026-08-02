package zendesk.core;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes5.dex */
class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;

    /* renamed from: id, reason: collision with root package name */
    private Long f68702id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getId() {
        return this.f68702id;
    }

    public Long getSize() {
        return this.size;
    }

    @NonNull
    public List<Attachment> getThumbnails() {
        return com.zendesk.util.a.a(this.thumbnails);
    }

    public String getUrl() {
        return this.url;
    }
}
