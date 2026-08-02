package zendesk.core;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import md.d;
import md.e;

/* loaded from: classes5.dex */
class ZendeskUserProvider implements UserProvider {
    private final UserService userService;
    private static final d.b USER_EXTRACTOR = new d.b() { // from class: zendesk.core.ZendeskUserProvider.6
        @Override // md.d.b
        public User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private static final d.b FIELDS_EXTRACTOR = new d.b() { // from class: zendesk.core.ZendeskUserProvider.7
        @Override // md.d.b
        public List<UserField> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final d.b FIELDS_MAP_EXTRACTOR = new d.b() { // from class: zendesk.core.ZendeskUserProvider.8
        @Override // md.d.b
        public Map<String, String> extract(UserResponse userResponse) {
            return (userResponse == null || userResponse.getUser() == null) ? com.zendesk.util.a.b(new HashMap()) : userResponse.getUser().getUserFields();
        }
    };
    private static final d.b TAGS_EXTRACTOR = new d.b() { // from class: zendesk.core.ZendeskUserProvider.9
        @Override // md.d.b
        public List<String> extract(UserResponse userResponse) {
            return (userResponse == null || userResponse.getUser() == null) ? com.zendesk.util.a.a(new ArrayList()) : userResponse.getUser().getTags();
        }
    };

    public ZendeskUserProvider(UserService userService) {
        this.userService = userService;
    }

    @Override // zendesk.core.UserProvider
    public void addTags(@NonNull List<String> list, final e eVar) {
        this.userService.addTags(new UserTagRequest(com.zendesk.util.a.c(list))).enqueue(new md.d(new PassThroughErrorZendeskCallback<List<String>>(eVar) { // from class: zendesk.core.ZendeskUserProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(List<String> list2) {
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void deleteTags(@NonNull List<String> list, final e eVar) {
        this.userService.deleteTags(com.zendesk.util.d.e(com.zendesk.util.a.c(list))).enqueue(new md.d(new PassThroughErrorZendeskCallback<List<String>>(eVar) { // from class: zendesk.core.ZendeskUserProvider.2
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(List<String> list2) {
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUser(final e eVar) {
        this.userService.getUser().enqueue(new md.d(new PassThroughErrorZendeskCallback<User>(eVar) { // from class: zendesk.core.ZendeskUserProvider.5
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(User user) {
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onSuccess(user);
                }
            }
        }, USER_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUserFields(final e eVar) {
        this.userService.getUserFields().enqueue(new md.d(new PassThroughErrorZendeskCallback<List<UserField>>(eVar) { // from class: zendesk.core.ZendeskUserProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(List<UserField> list) {
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onSuccess(list);
                }
            }
        }, FIELDS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void setUserFields(@NonNull Map<String, String> map, final e eVar) {
        this.userService.setUserFields(new UserFieldRequest(map)).enqueue(new md.d(new PassThroughErrorZendeskCallback<Map<String, String>>(eVar) { // from class: zendesk.core.ZendeskUserProvider.4
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(Map<String, String> map2) {
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onSuccess(map2);
                }
            }
        }, FIELDS_MAP_EXTRACTOR));
    }
}
